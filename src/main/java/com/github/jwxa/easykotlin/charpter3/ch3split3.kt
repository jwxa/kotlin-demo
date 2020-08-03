package com.github.jwxa.easykotlin.charpter3

import java.util.*

fun typeInference() {
    val str = "abc"
    println(str)
    println(str is String)
    println(str::class)
    println(str::class.java)

    // abc
    // true
    // class java.lang.String (Kotlin reflection is not available)
    // class java.lang.String

    val d = Date()
    println(d)
    println(d is Date)
    println(d::class)
    println(d::class.java)

    // Fri Jun 09 00:06:33 CST 2017
    // true
    // class java.util.Date (Kotlin reflection is not available)
    // class java.util.Date

    val bool = true
    println(bool)
    println(bool is Boolean)
    println(bool::class)
    println(bool::class.java)

    // true
    // true
    // boolean (Kotlin reflection is not available)
    // boolean

    val array = arrayOf(1, 2, 3)
    println(array)
    println(array is Array)
    println(array::class)
    println(array::class.java)

    // [Ljava.lang.Integer;@1d56ce6a
    // true
    // class [Ljava.lang.Integer; (Kotlin reflection is not available)
    // class [Ljava.lang.Integer;

}

fun Int2Long() {
    val x: Int = 10
    // val y:Long = x //Type mismatch
    val y: Long = x.toLong()
}

fun getLength(obj: Any): Int? {
    var result = 0
    if (obj is String) {
        //`obj`在该条件分支内自动转换成`String`
        println(obj::class)
        result = obj.length
        println(result)
    }
    // 在离开类型检测分支后，`obj`仍然是`Any`类型
    println(obj::class)
    return result
}


fun main() {
    typeInference()
}