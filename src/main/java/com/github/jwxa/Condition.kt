package com.github.jwxa

fun ifCondition1(a: Int, b: Int) {
    var max = a
    if (a < b) max = b
}

fun ifCondition2(a: Int, b: Int) {
    var max = a
    if (a > b) {
        max = b
    } else {
        max = a
    }
}


fun ifCondition3(a: Int, b: Int) {
    val max = if (a > b) a else b
}

fun ifCondition4(a: Int, b: Int) {
    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
}

fun main(args: Array<String>) {
    var x = 0
    if (x > 0) {
        println("x 大于 0")
    } else if (x == 0) {
        println("x 等于 0")
    } else {
        println("x 小于 0")
    }
    var a = 1
    var b = 2
    val c = if (a >= b) a else b
    println("c 的值为 $c")
}


fun main1(args: Array<String>) {
    val x = 5
    val y = 9
    if (x in 1..8) {
        println("x 在区间内")
    }
}


fun when1(x: Int) {
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x 不是 1 也不是 2")
        }
    }
}

fun when2(x: Int) {
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }
}

fun when3(x: Int) {
    val validNumbers = 11..20
    when (x) {
        in 1..10 -> print("x is in the range")
        in validNumbers -> print("x is valid")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}

fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
}


class Obj {

    fun isOdd(): Boolean {
        return true
    }

    fun isEven(): Boolean {
        return false
    }

}

fun when4(x: Obj) {
    when {
        x.isOdd() -> print("x is odd")
        x.isEven() -> print("x is even")
        else -> print("x is funny")
    }
}
