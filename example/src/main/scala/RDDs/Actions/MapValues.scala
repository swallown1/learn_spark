package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object MapValues {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("MapValues")
    val src = new SparkContext(conf)
    val data = List(("张三", 21), ("李四", 26), ("王五", 17))
    val rdd1 = src.parallelize(data)
    val mapValueRDD = rdd1.mapValues(_ + 2)
    mapValueRDD.foreach(println)
  }
}
