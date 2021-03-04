package v1.post

import javax.inject.Inject

import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._

/**
  * Routes and URLs to the PostResource controller.
  */
class MeerkatRouter @Inject()(controller: MeerkatController) extends SimpleRouter {
  val prefix = "/v1/posts"


  override def routes: Routes = {
    case GET(p"/generate") =>
      controller.generate

    case POST(p"/update") =>
      controller.update

    case GET(p"/export") =>
      controller.export
  }

}
