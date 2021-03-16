package meerkat

import javax.inject.Inject

import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._
import meerkat.PageGenerator.Article

/**
  * Routes and URLs to the MeerkatResource controller.
  */
class MeerkatRouter @Inject()(controller: MeerkatController) extends SimpleRouter {

  override def routes: Routes = {
    case GET(p"/generate") =>
      controller.generate

    case POST(p"/update") =>
      controller.update

    case POST(p"/updateSession") =>
      controller.updateSession

    case POST(p"/updateInternal") =>
      controller.updateInternal

    case GET(p"/export") =>
      controller.export

    case GET(p"/") =>
      controller.renderPage
  }

}
