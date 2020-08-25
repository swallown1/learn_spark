package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object SortByKey {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("SortByKey")
    val src = new SparkContext(conf)
    val data = List(("A",1),("B",2),("A",2),("B",3))
    val rdd1 = src.parallelize(data,2)
    val sortByKeyRDD = rdd1.sortByKey(false,2)
    sortByKeyRDD.foreach(println)
  }
}
