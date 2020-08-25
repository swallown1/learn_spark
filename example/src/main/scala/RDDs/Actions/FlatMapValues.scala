package RDDs.Actions

import org.apache.spark.{SparkConf, SparkContext}

object FlatMapValues {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local").setAppName("FlatMapValues")
    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(List(("zhangsan", 22), ("lisi", 20), ("wangwu", 23)))
    val flatMapValues = rdd.flatMapValues(x=> Seq("male"))
    flatMapValues.foreach(println)
    sc.stop
  }
}
