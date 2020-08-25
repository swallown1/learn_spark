package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object Actions {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Actions")
    val src = new SparkContext(conf)
    val rdd1 = src.parallelize(1 to 10, 2)
    val reduceRDD = rdd1.reduce(_ + _)
    println("func +: " + reduceRDD)
  }
}
