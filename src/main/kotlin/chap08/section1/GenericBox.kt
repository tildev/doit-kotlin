package chap08.section1

class Box<T>(t: T) { // 형식 매개변수로 받은 인자를 name 에 저장
    var name = t
}

fun main() {
    val box1: Box<Int> = Box<Int>(1)
    val box2: Box<String> = Box<String>("Hello")
    println(box1.name)
    println(box2.name)

    val box3 = Box(1) // 1 은 Int 형이므로 Box<Int> 로 추론
    val box4 = Box("Hello") // "Hello" 는 String 형이므로 Box<String> 로 추론

    println(box3.name)
    println(box4.name)
}

