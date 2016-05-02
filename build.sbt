name := """FitterPlay"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  // If you enable PlayEbean plugin you must remove these
  // JPA dependencies to avoid conflicts.
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.7.Final",
  "com.twitter" % "hbc-core" % "2.2.0",
  "org.slf4j" % "slf4j-simple" % "1.7.21",
  "org.json" % "json" % "20160212",
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.4"
)

