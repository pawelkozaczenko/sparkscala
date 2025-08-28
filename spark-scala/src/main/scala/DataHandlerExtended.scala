package spark.scala.utils

import spark.scala.utils.DataHandler
import org.apache.spark.sql.DataFrame;

class DataHandlerExtended (_dataFrame: DataFrame) extends DataHandler (_dataFrame) {
    //@TOOD add dynnamic columns vargargs
    def showColumns(rowsNumber: Int, userColumn: String, tsColumn: String): Unit = {
        _dataFrame.select(userColumn, tsColumn).show(rowsNumber);
    }
}
