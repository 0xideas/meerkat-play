package v1.post

import javax.inject.Inject
import play.api.libs.json._

import play.api.Logger
import play.api.data.Form
import play.api.libs.json.Json
import play.api.mvc._
import play.api.libs.circe.Circe

import scala.concurrent.{ExecutionContext, Future}
import v1.post.PageGenerator.pageGenerator

/**
  * Takes HTTP requests and produces JSON.
  */
class MeerkatController @Inject()(cc: MeerkatControllerComponents)(
    implicit ec: ExecutionContext)
    extends PostBaseController(cc)
    with Circe{

  private val logger = Logger(getClass)

  case class CandidateGenerateeId(articleId: Int, generateeIds: List[Int])
  //implicit val formatGenerateeIds = Json.format[GenerateeIds]
  implicit def idsToList: CandidateGenerateeId => (Int, List[Int]) = cand => (cand.articleId, cand.generateeIds) 

  case class Update(articleId: Option[Int], headlines: List[CandidateGenerateeId])
  //implicit val formatUpdate = Json.format[Update]

  case class Subpage[ArticleID, Generatee](articleId: ArticleID, generatee: Generatee, generateeId: List[Int])
  implicit val subpageFormat = Json.format[Subpage[Int, String]]


  private val form: Form[Update] = {
    import play.api.data.Forms._
    Form(
      mapping(
        "articleId" -> optional(number),
        "headlines" -> list(mapping("articleId" -> number, "generateeIds" -> list(number))(CandidateGenerateeId.apply)(CandidateGenerateeId.unapply))
      )(Update.apply)(Update.unapply)
    )
  }


  def generate: Action[AnyContent] = PostAction.async { implicit request =>
    logger.trace("generate: ")
    val response = pageGenerator.generate()
    Future.successful(Ok(Json.obj("subpages" -> response)))
  }
  
  def update: Action[AnyContent] = PostAction.async { implicit request =>
    logger.trace("update: ")
    processJsonPost()
  }

  def export: Action[AnyContent] = PostAction.async { implicit request =>
      logger.trace(s"export: ")
      Future.successful(Ok(pageGenerator.export()))
  }

  private def processJsonPost[A]()(
      implicit request: MeerkatRequest[A]): Future[Result] = {
    def failure(badForm: Form[Update]): Future[Result] = {
      Future.successful(BadRequest(badForm.errorsAsJson))
    }

    def success(input: Update): Future[Result] = {
      println(input)
      pageGenerator.update(input.articleId, input.headlines.map(i => idsToList(i)).toMap)
      Future.successful(Ok("Update successful"))
    }

    form.bindFromRequest().fold(failure, success)
  }
}
