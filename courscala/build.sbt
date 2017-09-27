import Dependencies._

name := "courscala"

libraryDependencies ++= Seq(
  PlayJson.playJson,
  PlayJsonJoda.playJsonJoda,
  JUnitInterface.junitInterface,
  Scalatest.scalatest)

testFrameworks := Seq(sbt.TestFrameworks.JUnit)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v", "-q", "-a")
