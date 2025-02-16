package chap08.section1

class InvariantBox<T>(val size: Int)
class CovariantBox<out T>(val size: Int)
class ContravariantBox<in T>(val size: Int)

fun main() {
    // Any <- Int <- Nothing

    /*
    val anys: InvariantBox<Any> = Box<Int>(10) // 오류. 자료형 불일치
    val nothings: InvariantBox<Nothing> = Box<Int>(20) // 오류. 자료형 불일치
     */

    val anys: CovariantBox<Any> = CovariantBox<Int>(10) // 관게 성립으로 객체 생성 가능
    /*
    val nothings: CovariantBox<Nothing> = CovariantBox<Int>(20) // 오류. 자료형 불일치
     */

    /*
    val anys: ContravariantBox<Any> = ContravariantBox<Int>(10) // 오류. 자료형 불일치
     */
    val nothings: ContravariantBox<Nothing> = ContravariantBox<Int>(20) // 관게 성립으로 객체 생성 가능

}