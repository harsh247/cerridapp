name := "Cerrid Analytics"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  cache,
  filters
)    

resolvers += (
    "LocalRepository" at "file:///"+Path.userHome.absolutePath+"/cerrid/cerrid/codebase/cerrid-app/lib/"
)

unmanagedResourceDirectories in Assets += baseDirectory.value / "public/javascripts"
//playAssetsDirectories <+= baseDirectory / "javascripts" 

lazy val root = (project in file(".")).enablePlugins(PlayJava).enablePlugins(SbtWeb)

//lazy val root = (project in file(".")).enablePlugins(SbtWeb)
pipelineStages := Seq(rjs, digest, gzip)