package spark.scala.utils

import org.apache.spark.sql.DataFrame;

class DataHandler (dataFrame: DataFrame) {
    //shows fierst 20 rows by default
    def showFistRows(): Unit = {
        dataFrame.show();
    }

    def show(rowsNumber: Int): Unit = {
        dataFrame.show(rowsNumber);
    }

    def printlnSchema(): Unit = {
        dataFrame.printSchema();
    }
}
