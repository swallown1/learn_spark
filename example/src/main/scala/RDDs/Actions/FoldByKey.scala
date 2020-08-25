package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object FoldByKey {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("FoldByKey")
    val src = new SparkContext(conf)
    val data = List(("张三", 21), ("李四", 26), ("王五", 17), ("张三", 17))
    val rdd1 = src.parallelize(data)
    val mapValueRDD = rdd1.foldByKey(1)(_ + _)
    mapValueRDD.foreach(println)
  }

}
