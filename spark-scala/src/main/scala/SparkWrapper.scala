package spark.scala.utils

import org.apache.spark.sql.{DataFrame, SparkSession}

object SparkWrapper {

    private val APP_NAME: String = "SparkScala"
    private val PORT: String = "0.0.0.0" //portNumber from readme.txt
    private val DATA_DIR: String = "data/"
    private val HEADER = "true"
    private val INFER_SCHEMA = "true"

    private var spark: SparkSession = _

    def init(): Unit = {
        println(s"Starting $APP_NAME on port: $PORT");
        spark = SparkSession.builder()
            .appName("SparkScala")
            .master("local[*]")
            .config("spark.deiver.bindAddress", PORT)
            .getOrCreate()
    }

    def readFile(fileName: String): DataFrame = {
        spark.read
            .option("header", HEADER)
            .option("inferSchema", INFER_SCHEMA)
            .csv(s"$DATA_DIR$fileName")
    }

    def exit(): Unit = {
        println(s"Stopping $APP_NAME on port: $PORT");
        spark.stop();
    }
}
