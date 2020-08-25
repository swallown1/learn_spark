package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object MapValus {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("MapValus")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(List(("zhangsan", 22), ("lisi", 20), ("wangwu", 23)))
    val mapValuesRDD = rdd.mapValues(_+2)
    mapValuesRDD.foreach(println)
    sc.stop
  }
}
