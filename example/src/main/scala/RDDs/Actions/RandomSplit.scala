package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object RandomSplit {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("RandomSplit")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(1 to 10)
    val randomSplitRDD = rdd.randomSplit(Array(1.0,2.0,7.0))
    randomSplitRDD(0).foreach(x => print(x +" "))
    randomSplitRDD(1).foreach(x => print(x +" "))
    randomSplitRDD(2).foreach(x => print(x +" "))
    sc.stop
  }
}
