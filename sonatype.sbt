sonatypeProfileName := "com.varwise"

publishMavenStyle := true

// License of your choice
licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))
homepage := Some(url("https://github.com/varwise/scala-util/"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/varwise/scala-util/"),
    "scm:git@github.com:varwise/scala-util.git"
  )
)
developers := List(
  Developer(id="wlk", name="Wojciech Langiewicz", email="", url=url("https://www.wlangiewicz.com"))
)