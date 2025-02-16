package chap08.section1

interface InterfaceA
interface InterfaceB

class HandlerA : InterfaceA, InterfaceB
class HandlerB : InterfaceA

class ClassA<T> where T : InterfaceA, T : InterfaceB // 2 개의 인터페이스를 구현하는 클래스로 제한

fun <T> myMax(a: T, b: T): T where T : Number, T : Comparable<T> {
    return if (a > b) a else b
}

fun main() {
    val obj1 = ClassA<HandlerA>() // 객체 생성 가능
    // val obj2 = ClassA<HandlerB>() // 범위에 없으므로 오류 발생
}