package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object GroupByKey {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("GroupByKey")
    val src = new SparkContext(conf)
    val data = List(("A",1),("B",2),("A",2),("B",3))
    val rdd1 = src.parallelize(data,2)
    val groupByKeyRDD = rdd1.groupByKey(2)
    groupByKeyRDD.foreach(println)
  }
}
