package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object Cartesian {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Cartesian")
    val sc = new SparkContext(conf)
    val rdd1 = sc.parallelize(1 to 3)
    val rdd2 = sc.parallelize(4 to 6)
    val cartesianRDD  = rdd1.cartesian(rdd2)
    cartesianRDD.foreach(x => print(x + " "))
    sc.stop()
  }
}
