package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object Coalesce {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("Coalesce")
    val sc = new SparkContext(conf)

    val rdd = sc.parallelize(1 to 16 ,4)
    println("重新分区前的分区个数"+rdd.partitions.size)
    val coalesceRDD = rdd.coalesce(7,true)
    println("重新分区后的分区个数:"+coalesceRDD.partitions.size)

    sc.stop()
  }
}
