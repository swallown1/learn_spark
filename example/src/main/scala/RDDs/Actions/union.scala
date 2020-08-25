package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object union {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("union")
    val sc = new SparkContext(conf)
    val rdd1 = sc.parallelize(1 to 4)
    val rdd2 = sc.parallelize(4 to 8)
    val unionRDD  = rdd1.union(rdd2)
    unionRDD.foreach(x => print(x + " "))
    sc.stop()

  }

}
