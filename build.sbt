name := "DesignPatternInScala"

version := "1.0"

publishMavenStyle := true

organization := "com.pattern"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked", "-feature")


resolvers ++= Seq(
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)


parallelExecution in Test := false
//sbt.version=0.13.11

//mainClass := Some("Application.scala")