package chap02.section2

typealias Username = String

fun main() {
    val num = 10
    val formattedString = """
        var a = 6
        var b = "Kotlin"
        println(a + num)
    """.trimIndent()
    println(formattedString)

    val User: Username = "Kildong"
    println(User)
}