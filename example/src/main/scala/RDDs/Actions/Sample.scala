package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object Sample {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Sample")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(1 to 10)
    val samle1 = rdd.sample(true, 0.8, 0)
    samle1.foreach(x => print(x + " "))
    sc.stop()

  }
}
