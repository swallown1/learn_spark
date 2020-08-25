package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object ParaCollections {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("ParaCollections").setMaster("local")
    val sc = new SparkContext(conf)
    val ints = Array(1, 2, 3, 4, 5, 6)
    val rdd = sc.parallelize(ints, 10)

    val data1 = sc.textFile("src/main/scala/assets/1.txt")

    print(data1.map(s => s.length))
  }
}
