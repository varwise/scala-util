import scalariform.formatter.preferences._
import com.typesafe.sbt.SbtScalariform.ScalariformKeys

name := "scala-util"

organization := "com.varwise"

version := "0.2.3"

scalaVersion := "2.12.3"

resolvers += "Sonatype release repository" at "https://oss.sonatype.org/content/repositories/releases/"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val scalaTestVersion      = "3.0.4"
  val logbackClassicVersion = "1.2.3"
  val akkaHttpVersion       = "10.0.10"

  Seq(
    "io.airbrake"          % "airbrake-java"                         % "2.2.8",
    "ch.qos.logback"       %  "logback-classic"                      % logbackClassicVersion % "provided",
    "org.scalatest"        %% "scalatest"                            % scalaTestVersion % "provided",
    "com.typesafe.akka"    %% "akka-http-core"                       % akkaHttpVersion
  )
}

fork := true

scalariformSettings(autoformat = true)

ScalariformKeys.preferences := ScalariformKeys.preferences.value
  .setPreference(AlignSingleLineCaseStatements, true)
  .setPreference(DoubleIndentConstructorArguments, true)
  .setPreference(SpacesAroundMultiImports, false)
  .setPreference(CompactControlReadability, false)

publishTo := Some(
  if (isSnapshot.value)
    Opts.resolver.sonatypeSnapshots
  else
    Opts.resolver.sonatypeStaging
)