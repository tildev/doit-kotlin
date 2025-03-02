package chap08.section2

fun main() {
    // 자료형이 지정된 배열은 다른 자료형으로 변환할 수 없으나,
    // Any 자료형으로 만들어진 배결은 기존 자료형을 다른 자료형으로 지정 가능
    val b = Array<Any>(10, { 0 })
    b[0] = "Hello Wrold"
    b[1] = 1.1
    println(b[0])
    println(b[1])
    println(b[2])

    b.forEach { element -> println("$element") }
    b.forEachIndexed({ i, e -> println("b[$i] = $e") })

    val iter: Iterator<Any> = b.iterator()
    while (iter.hasNext()) {
        val e = iter.next()
        println("$e")
    }
}