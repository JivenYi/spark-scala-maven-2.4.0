package com.opensource.bigdata.spark.local.rdd.operation.transformation

import com.opensource.bigdata.spark.local.rdd.operation.base.BaseScalaSparkContext

object FilterRun extends BaseScalaSparkContext{

  var appName = "worldcount-3"
  var master = "local" //本地模式:local     standalone:spark://master:7077

  def main(args: Array[String]): Unit = {
    val sc = pre()
    val r1 = sc.parallelize(Array("A","AA","AB","BV","C","V","W"),2)
    val r2 = r1.filter(_.startsWith("A")).collect().mkString

    println("结果:"+ r2)



    sc.stop()
  }


}
