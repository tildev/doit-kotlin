package chap08.section1

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
    val obj1: Parent = Child() // Parent 형식의 obj1 은 Child 의 자료형으로 변환될 수 있음
    // val obj2: Child = Parent() // 오류! 자료형 불일치

    // val obj3: Cup<Parent> = Cup<Child>() // 오류! 자료형 불일치
    // val obj4: Cup<Child> = Cup<Parent>() // 오류! 자료형 불일치

    val obj5 = Cup<Child>() // obj5 는 Cup<Child> 의 자료형이 됨
    val obj6: Cup<Child> = obj5 // 자료형이 일치하므로 OK!
}

