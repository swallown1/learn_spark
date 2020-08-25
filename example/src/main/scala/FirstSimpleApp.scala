/* SimpleApp.scala */
import org.apache.spark.SparkContext
//import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf


object FirstSimpleApp {
  def main(args: Array[String]) {
    val logFile = "src/main/scala/assets/1.txt" // 应该是你系统上的某些文件
    val conf = new SparkConf().setAppName("FirstSimpleApp")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 2).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }
}