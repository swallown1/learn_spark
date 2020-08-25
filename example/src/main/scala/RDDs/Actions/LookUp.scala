package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object LookUp {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("LookUp").setMaster("local")
    val sc = new SparkContext(conf)
    val arr = List(("A", 1), ("B", 2), ("A", 2), ("B", 3))
    val rdd = sc.parallelize(arr, 2)

    val lookupRDD = rdd.lookup("A")

    println("lookup:")
    lookupRDD.foreach(x => print(x + " "))
  }
}
