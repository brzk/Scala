ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "OptionUtils"
  )


libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.2.19",
  "org.scalatest" %% "scalatest" % "3.2.19" % "test",
  "org.scalatestplus" %% "mockito-5-12" % "3.2.19.0" % "test"
)
