package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object ReduceByKey {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("ReduceByKey")
    val src = new SparkContext(conf)
    val data = List(("A", 3), ("A", 2), ("B", 1), ("B", 3))
    val rdd1 = src.parallelize(data,2)
    val reduceByKeyRDD = rdd1.reduceByKey(_ * _,2)
    reduceByKeyRDD.foreach(println)
    println(reduceByKeyRDD.partitions.size)
  }
}
