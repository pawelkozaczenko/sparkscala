package spark.scala.utils

//import org.apache.spark.sql.functions.col
import spark.scala.utils.{DataHandler, DataHandlerExtended, SparkWrapper}

object DataProcessor {
    def run(): Unit = {
        val nasaLstm = new DataHandler(SparkWrapper.readFile("NASALSTM.csv"));
        nasaLstm.printlnSchema()
        nasaLstm.showFistRows()
        nasaLstm.show(5)
        val ssh = new DataHandlerExtended(SparkWrapper.readFile("SSH.csv"));
        ssh.printlnSchema()
        ssh.show(5)
        ssh.showColumns(5, "user", "ts")
        /*
        df.select("Date", "Open", "Close").show(5);
        df.select("Date", "Open", "Close").show(50);
        val column = df("Date");
        col("Date");
        import spark.implicits._
        $"Date"
        df.select(col("Date"), $"Open", df("Close")).show()
        df.select(column).show(5);
        println("*******");
        df.select(df("Date"), df("Open")).show(5);
        df.select(df("Date"), df("Open") + 10).show(5);
        df.select(column, df("Open") - 10).show(5);
        println("*******");
        df.selectExpr("Date", "(Open + 10) as Opened").show(5);
        df.filter(df("Open") < 500).show(5);
        df.groupBy("Close").count().show(5);
        df.groupBy("Close").count().orderBy("count").show(5);
        */
    }
}
