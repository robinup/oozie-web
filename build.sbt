organization := "com.foursquare"

name := "oozie-web"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.9.1"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.4",
  "org.scalatra" %% "scalatra-scalate" % "2.0.4",
  "org.scalatra" %% "scalatra-specs2" % "2.0.4" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "7.6.0.v20120127" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.scalaj" %% "scalaj-collection" % "1.2",
  "com.yahoo.oozie" % "oozie-client" % "2.3.2-cdh3u3",
  "com.typesafe" % "config" % "0.5.0"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "Cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/"

ivyXML := (
<dependencies>
 <exclude module="jmxtools"/>
 <exclude module="jmxri"/>
 <exclude org="org.apache" name="hadoop-core"/>
</dependencies>
)