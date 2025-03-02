package chap08.section2

fun main() {
    val numbers = arrayOf(1, 2, 3)
    val strings = arrayOf("one", "two", "three")
    val simpleArray = arrayOf(numbers, strings)

    simpleArray.forEach { println(it.contentToString()) }

    val flattenSimpleArray = simpleArray.flatten()
    println(flattenSimpleArray)

}