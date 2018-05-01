name := """play-fun"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.6")

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

libraryDependencies += "org.postgresql" % "postgresql" % "42.2.2"

libraryDependencies += "com.typesafe.play" %% "play-slick" % "3.0.3"
libraryDependencies += "com.typesafe.play" %% "play-slick-evolutions" % "3.0.3"

libraryDependencies += specs2 % Test


/*
conflictManager := ConflictManager.strict

dependencyOverrides += "com.typesafe.akka" %% "akka-actor" % "2.5.4"

dependencyOverrides += "com.typesafe.akka" %% "akka-stream" % "2.5.4"

dependencyOverrides += "org.scala-lang" % "scala-library" % "2.12.4"
*/
