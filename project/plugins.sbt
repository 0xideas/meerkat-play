// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.7")

// sbt-paradox, used for documentation
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.8.0")

// Load testing tool:
// http://gatling.io/docs/2.2.2/extensions/sbt_plugin.html
addSbtPlugin("io.gatling" % "gatling-sbt" % "3.0.0")

// Scala formatting: "sbt scalafmt"
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")


addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.5.0")


addSbtPlugin("com.heroku" % "sbt-heroku" % "2.1.4")


addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.4.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0")
