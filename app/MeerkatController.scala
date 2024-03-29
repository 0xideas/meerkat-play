package meerkat

import javax.inject.Inject
import play.api.libs.json._

import play.api.Logger
import play.api.data.Form
import play.api.libs.json.Json
import play.api.mvc._
import play.api.libs.circe.Circe
import play.api.mvc.Results._

import scala.concurrent.{ExecutionContext, Future}
import meerkat.PageGeneratorAppl.{pageGenerator, Article}
import controllers.routes
import io.circe.generic.auto._
import io.circe.syntax._
import io.circe._, io.circe.generic.semiauto._
import io.circe.parser._
import ada.interface.{Tree, Leaf, Twig, Branch, Stub}
import scala.language.implicitConversions
import ada.enhancements.EncodeDecodeTree

object MeerkatControllerTypes{
  import play.api.libs.json.{JsValue => PlayJson, Json => PlayJsonObj}

  val encodeDecodeTree = new EncodeDecodeTree[Int]()(i => i.toString, s => s.toInt)

  case class CandidateGeneratee(articleId: Int, generateeIds: String)
  //implicit val formatGenerateeIds = Json.format[GenerateeIds]
  def idsToList: CandidateGeneratee => (Int, Tree[Int]) = cand => (cand.articleId, encodeDecodeTree.convertStringToTree(cand.generateeIds))

  case class Update(articleId: Int, headlines: List[CandidateGeneratee])
  //implicit val formatUpdate = Json.format[Update]

  case class UpdateSession(articleIds: List[Int], headlines: List[CandidateGeneratee])
  //implicit val formatUpdate = Json.format[Update]

  case class Subpage[ArticleID, Generatee](articleId: ArticleID, generatee: Generatee, generateeId: List[Int])
  implicit val subpageFormat = Json.format[Subpage[Int, String]]

  case class JsonContainer(value: Json)


}
/**
  * Takes HTTP requests and produces JSON.
  */
class MeerkatController @Inject()(cc: MeerkatControllerComponents)(
    implicit ec: ExecutionContext)
    extends MeerkatBaseController(cc)
    with Circe{

  import MeerkatControllerTypes._
  private val logger = Logger(getClass)

  private val formUpdate: Form[Update] = {
    import play.api.data.Forms._
    Form(
      mapping(
        "articleId" -> number,
        "headlines" -> list(mapping("articleId" -> number, "generateeIds" -> text)(CandidateGeneratee.apply)(CandidateGeneratee.unapply))
      )(Update.apply)(Update.unapply)
    )
  }

  private val formUpdateSession: Form[UpdateSession] = {
    import play.api.data.Forms._
    Form(
      mapping(
        "articleIds" -> list(number),
        "headlines" -> list(mapping("articleId" -> number, "generateeIds" -> text)(CandidateGeneratee.apply)(CandidateGeneratee.unapply))
      )(UpdateSession.apply)(UpdateSession.unapply)
    )
  }

  def generate: Action[AnyContent] = PostAction.async { implicit request =>
    logger.trace("generate: ")
    val response = pageGenerator.generate().map{case(a, b, c) => (a, b.headline, encodeDecodeTree.convertTreeToString(c))}
    Future.successful(Ok(Json.obj("subpages" -> response)))
  }
  
  def update: Action[AnyContent] = PostAction.async { implicit request =>
    logger.trace("update: ")
    processJsonUpdate(request)
  }

  def updateSession: Action[AnyContent] = PostAction.async { implicit request =>
    logger.trace("update: ")
    processJsonUpdateSession(request)
  }

  def set = Action { request =>
    val parameters = request.body.asJson.get.toString()
    println(parameters)
    io.circe.parser.parse(parameters) match {
      case(Right(pars)) => {
        pageGenerator.set(pars)
        pageGenerator.export() == pars match {
          case(true) => Ok("Set was successful")
          case(_) => Ok("Json could not be used to set parameters")
        }
      }
      case(Left(err)) => {
        Ok("Set not successful: " + err.toString())
      }
    }
    
  }

  def export: Action[AnyContent] = PostAction.async { implicit request =>
      logger.trace(s"export: ")
      Future.successful(Ok(pageGenerator.export()))
  }

  def renderPage: Action[AnyContent] = PostAction.async { implicit request =>
    val headlines: List[(Int, Article, Tree[Int])] = pageGenerator.generate()
    val headlines2 = headlines.map(_._2)
    val headlines3 = headlines.map(h => CandidateGeneratee(h._1,  encodeDecodeTree.convertTreeToString(h._3)))
    val html = views.html.renderPage(headlines2, headlines3)
    Future.successful(Ok(html).as("text/html"))
  }

  private def processJsonUpdateSession[A](implicit request: MeerkatRequest[A]): Future[Result] = {
    def failure(badForm: Form[UpdateSession]): Future[Result] = {
      Future.successful(BadRequest(badForm.errorsAsJson))
    }

    def success(input: UpdateSession): Future[Result] = {
      input.articleIds.map(articleId => pageGenerator.update(Some(articleId), input.headlines.map(i => idsToList(i))))
      Future.successful(Ok("Session update successful"))
    }
    formUpdateSession.bindFromRequest().fold(failure, success)
  }

  private def processJsonUpdate[A](implicit request: MeerkatRequest[A]): Future[Result] = {
    def failure(badForm: Form[Update]): Future[Result] = {
      println("Update not successful")
      Future.successful(BadRequest(badForm.errorsAsJson))
    }

    def success(input: Update): Future[Result] = {
      val articleId = input.articleId match {
        case(GlobalVariables.NO_ARTICLE_SELECTED_ID) => None
        case(i) => Some(i)
      }
      val input2 = input.headlines.map(id => idsToList(id))
      pageGenerator.update(articleId, input2)
      println("Update successful")
      Future.successful(Ok("Update successful"))
    }
    formUpdate.bindFromRequest().fold(failure, success)
  }


}
