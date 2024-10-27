package chap02.section2

fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")

    var a = 1
    val s1 = "a is $a"
    println(s1)
    val str11 = "a = $a"
    val str22 = "a = ${a + 2}"
    println("str1: \"$str11\", str2: \"$str22\"")

    val special = "\"hello\", I have \$15"
    println(special)
    val special2 = "${'"'}${'$'}9.99${'"'}"
    println(special2)
}