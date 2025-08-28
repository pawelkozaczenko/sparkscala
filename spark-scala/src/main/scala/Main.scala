import spark.scala.utils.{DataProcessor, SparkWrapper}

object Main extends App {

  SparkWrapper.init()

  DataProcessor.run();
  
  SparkWrapper.exit()
 
}