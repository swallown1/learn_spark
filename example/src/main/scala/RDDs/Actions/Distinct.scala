package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object Distinct {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Distinct")
    val sc = new SparkContext(conf)
    val rdd1 = sc.parallelize(List(1,2,3,1,3,2,4,6,4,6,8,6,5,3,1,2,4,7))
    val distinctRDD  = rdd1.distinct()
    distinctRDD.foreach(x => print(x + " "))
    sc.stop()
  }
}
