package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object Intersection {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Intersection")
    val sc = new SparkContext(conf)
    val rdd1 = sc.parallelize(1 to 4)
    val rdd2 = sc.parallelize(4 to 8)
    val intersectionRDD  = rdd1.intersection(rdd2)
    intersectionRDD.foreach(x => print(x + " "))
    sc.stop()

  }
}
