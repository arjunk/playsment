import sbt._
import Keys._
import PlayProject._
import de.johoop.jacoco4sbt.JacocoPlugin._

object ApplicationBuild extends Build {

    val appName         = "playsment"
    val appVersion      = "1.0-SNAPSHOT"

    lazy val s = Defaults.defaultSettings ++ Seq(jacoco.settings:_*)

    val appDependencies = Seq(
      // Add your project dependencies here,
    )


    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA, settings = s).settings(
      // Add your own project settings here
      parallelExecution in jacoco.Config := false
    )

}
