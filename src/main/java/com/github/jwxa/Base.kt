package com.github.jwxa

fun main(args: Array<String>) {

    print("循环输出：")
    for (i in 1..4) print(i)
    println("\n---------------------")
    print("设置步长：")
    for (i in 1..4 step 2) print(i)
    println("\n---------------------")
    print("使用downTo：")
    for (i in 4 downTo 1 step 2) print(i)
    println("\n---------------------")
    print("使用until：")
    for (i in 1 until 4) print(i)


}


fun sum(a: Int, b: Int): Int = a + b

fun printSum(a: Int, b: Int): Unit = print(a + b)

fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }

}

fun print(args: Array<String>) {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 2))
}

fun template() {

    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")},but now is $a"
    println(s2)

}

fun nullCheck() {

    //类型后面加?表示可为空
    var age: String? = "23"
    //抛出空指针
    val ages = age!!.toInt()
    //不做处理返回null
    val ages1 = age?.toInt()
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1

}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // 做过类型判断以后，obj会被系统自动转换为String类型
        return obj.length
    }
    // 这里的obj仍然是Any类型的引用
    return null
}


