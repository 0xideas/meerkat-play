package meerkat

import javax.inject.Inject
import play.api.libs.json._

import play.api.Logger
import play.api.data.Form
import play.api.libs.json.Json
import play.api.mvc._
import play.api.libs.circe.Circe

import scala.concurrent.{ExecutionContext, Future}
import meerkat.PageGenerator.pageGenerator

/**
  * Takes HTTP requests and produces JSON.
  */
class MeerkatController @Inject()(cc: MeerkatControllerComponents)(
    implicit ec: ExecutionContext)
    extends MeerkatBaseController(cc)
    with Circe{

  private val logger = Logger(getClass)

  case class CandidateGenerateeId(articleId: Int, generateeIds: List[Int])
  //implicit val formatGenerateeIds = Json.format[GenerateeIds]
  implicit def idsToList: CandidateGenerateeId => (Int, List[Int]) = cand => (cand.articleId, cand.generateeIds) 

  case class Update(articleId: Int, headlines: List[CandidateGenerateeId])
  //implicit val formatUpdate = Json.format[Update]

  case class UpdateSession(articleIds: List[Int], headlines: List[CandidateGenerateeId])
  //implicit val formatUpdate = Json.format[Update]

  case class Subpage[ArticleID, Generatee](articleId: ArticleID, generatee: Generatee, generateeId: List[Int])
  implicit val subpageFormat = Json.format[Subpage[Int, String]]


  private val formUpdate: Form[Update] = {
    import play.api.data.Forms._
    Form(
      mapping(
        "articleId" -> number,
        "headlines" -> list(mapping("articleId" -> number, "generateeIds" -> list(number))(CandidateGenerateeId.apply)(CandidateGenerateeId.unapply))
      )(Update.apply)(Update.unapply)
    )
  }

  private val formUpdateSession: Form[UpdateSession] = {
    import play.api.data.Forms._
    Form(
      mapping(
        "articleIds" -> list(number),
        "headlines" -> list(mapping("articleId" -> number, "generateeIds" -> list(number))(CandidateGenerateeId.apply)(CandidateGenerateeId.unapply))
      )(UpdateSession.apply)(UpdateSession.unapply)
    )
  }


  def generate: Action[AnyContent] = PostAction.async { implicit request =>
    logger.trace("generate: ")
    val response = pageGenerator.generate()
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

  def export: Action[AnyContent] = PostAction.async { implicit request =>
      logger.trace(s"export: ")
      Future.successful(Ok(pageGenerator.export()))
  }


  private def processJsonUpdateSession[A](implicit request: MeerkatRequest[A]): Future[Result] = {
    def failure(badForm: Form[UpdateSession]): Future[Result] = {
      Future.successful(BadRequest(badForm.errorsAsJson))
    }

    def success(input: UpdateSession): Future[Result] = {
      println(input)
      input.articleIds.map(articleId => pageGenerator.update(Some(articleId), input.headlines.map(i => idsToList(i)).toMap))
      Future.successful(Ok("Session update successful"))
    }
    formUpdateSession.bindFromRequest().fold(failure, success)
  }


  private def processJsonUpdate[A](implicit request: MeerkatRequest[A]): Future[Result] = {
    def failure(badForm: Form[Update]): Future[Result] = {
      Future.successful(BadRequest(badForm.errorsAsJson))
    }

    def success(input: Update): Future[Result] = {
      println(input)
      val articleId = input.articleId match {
        case(GlobalVariables.NO_ARTICLE_SELECTED_ID) => None
        case(i) => Some(i)
      }
      pageGenerator.update(articleId, input.headlines.map(i => idsToList(i)).toMap)
      Future.successful(Ok("Update successful"))
    }
    formUpdate.bindFromRequest().fold(failure, success)
  }
}
