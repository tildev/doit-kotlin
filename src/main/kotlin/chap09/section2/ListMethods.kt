package chap09.section2

fun main() {
    val names: List<String> = listOf("one", "two", "three")

    println(names.size)
    println(names[0])
    println(names.indexOf("three"))
    println(names.contains("two"))
}