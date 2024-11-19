package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1 // 접근 허용
    }

    fun access() {
        privateFunc() // 접근 허용
    }
}

class OtherClass {
    // 불가 - 프로퍼티 opc 는 private이 되어야 함
    // val opc = PrivateClass()
    private val opc = PrivateClass()
    fun test() {
        val pc = PrivateClass() // 생성 가능
    }
}

fun main() {
    val pc = PrivateClass()
    // 접근 불가
    // pc.i
    // pc.privateFunc()
}

fun TopFunction() {
    val tpc = PrivateClass() //객체 생성 가능
}