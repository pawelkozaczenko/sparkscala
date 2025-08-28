scalaVersion := "2.13.16"

val sparkVersion = "4.0.0"
libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion,
    "org.apache.spark" %% "spark-sql" % sparkVersion //% "provided"
)