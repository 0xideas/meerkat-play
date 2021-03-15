// @GENERATOR:play-routes-compiler
// @SOURCE:/home/leon/projects/meerkat/meerkat-play/conf/routes
// @DATE:Mon Mar 15 20:19:38 CET 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
