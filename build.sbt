libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" % Test

lazy val multipleSpecJars = (project in file("."))

val regexForPackagingJar = List("*Spec1.scala", "*Spec2.scala", "*Spec3.scala")

lazy val makeAllJars = taskKey[Unit]("make all jars")
lazy val makeOneJar = taskKey[Unit]("make jar for specific packages")

makeOneJar := Def.taskDyn{
  Def.task{
    includeFilter in (Compile, unmanagedSources) := "value from iteration from regexForPackagingJar"
    `package`.value
  }
}




