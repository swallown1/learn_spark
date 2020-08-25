package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object Glom {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Glom")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(1 to 6,2)
    val glomRDD = rdd.glom()
    glomRDD.foreach(x => println(x.getClass.getSimpleName))
    sc.stop()
  }
}
