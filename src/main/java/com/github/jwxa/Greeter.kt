package com.github.jwxa

class Greeter(val name: String) {

    fun hello() {
        println("Hello,$name")
    }

}

fun main() {
    Greeter("World!").hello()
}