import sbt.Keys._
import play.sbt.PlaySettings

unmanagedJars in Compile += file("/home/leon/projects/meerkat/meerkat-play/lib/adaensemble_2.13-0.1.jar")
//unmanagedResources in (Compile) ++= Seq(file(baseDirectory.value.getParentFile.getAbsolutePath + "/file.json"))

val circeVersion = "0.12.3"
val breezeVersion = "1.1"

lazy val root = (project in file("."))
  .enablePlugins(PlayService, PlayLayoutPlugin, Common, SbtTwirl)
  .settings(
    name := "play-scala-rest-api-example",
    scalaVersion := "2.13.4",
    libraryDependencies ++= Seq(
      guice,
      "org.joda" % "joda-convert" % "2.2.1",
      "net.logstash.logback" % "logstash-logback-encoder" % "6.2",
      "io.lemonlabs" %% "scala-uri" % "1.5.1",
      "net.codingwell" %% "scala-guice" % "4.2.6",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "io.circe" %% "circe-core" % circeVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "io.circe" %% "circe-parser" % circeVersion,
      "com.dripower" %% "play-circe" % "2712.0",
      "org.scalanlp" %% "breeze" % breezeVersion,
      "org.scalanlp" %% "breeze-natives" % breezeVersion,
      "org.scalanlp" %% "breeze-viz" % breezeVersion

    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    ),
    unmanagedBase := baseDirectory.value / "lib",
    updateOptions := updateOptions.value.withCachedResolution(false)
    )

resourceDirectory in Assets := (sourceDirectory in Compile).value / "public"

//addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.2")


herokuAppName in Compile := "salty-basin-55497"

lazy val gatlingVersion = "3.3.1"
lazy val gatling = (project in file("gatling"))
  .enablePlugins(GatlingPlugin)
  .settings(
    scalaVersion := "2.12.10",
    libraryDependencies ++= Seq(
      "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % Test,
      "io.gatling" % "gatling-test-framework" % gatlingVersion % Test
    )
  )



// Documentation for this project:
//    sbt "project docs" "~ paradox"
//    open docs/target/paradox/site/index.html
lazy val docs = (project in file("docs")).enablePlugins(ParadoxPlugin).
  settings(
    scalaVersion := "2.13.4",
    paradoxProperties += ("download_url" -> "https://example.lightbend.com/v1/download/play-samples-play-scala-rest-api-example")
  )


assemblyMergeStrategy in assembly := {
 case PathList("META-INF", xs @ _*) => MergeStrategy.discard
 case x => MergeStrategy.first
}

herokuFatJar in Compile := Some((assemblyOutputPath in assembly).value)
