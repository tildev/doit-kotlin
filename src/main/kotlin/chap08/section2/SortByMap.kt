package chap08.section2

import java.util.*

fun main() {
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase(Locale.getDefault()) }
        .forEach { println(it) }

    when {
        "apple" in fruits -> println("Apple!")
    }
    println(fruits.minBy { it.length })
    println(fruits.maxBy { it.length })
}