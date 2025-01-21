package chap07.section3

data class Number(val x: Int, val y: Int)

operator fun Number.unaryMinus() = Number(-x, -y)

fun grade(i: Int): String {
    return if (i in 80..100) "1" else "2"
}

fun main() {
    val number = Number(10, 20)
    println(-number) // 단일 연산자에 의해 (-10, -20) 값을 바꿈

    println(grade(80))

}