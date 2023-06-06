enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "3.2.2"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.2.0"