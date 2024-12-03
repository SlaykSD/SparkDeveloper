ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.0"

lazy val root = (project in file("."))
  .settings(
    name := "lesson-03"
  )
