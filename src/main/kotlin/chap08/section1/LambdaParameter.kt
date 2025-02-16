package chap08.section1

/*
fun <T> invalidAdd(a: T, b: T, op: (T, T) -> T): T {
    return a + b // 자료형을 아직 결정할 수 없으므로, 오류
}
*/

// 람다식을 매개변수로 받으면 자료형을 결정하지 않아도 실행 시 람다식 본문을 넘겨줄 때 결정
fun <T> add(a: T, b: T, op: (T, T) -> T): T {
    return op(a, b)
}

typealias arithmetic<T> = (T, T) -> T

fun <T> addAux(a: T, b: T, op: arithmetic<T>): T {
    return op(a, b)
}

fun main() {
    // 함수가 실행될 때 넘겨지는 인자이므로 연산식을 함수 선언부에 직접 구현하지 않고 전달하는 방법을 사용.
    // 함수의 형식 매개변수로 자료형을 특정하지 않아도 실행이 가능
    val result = add(2, 3, { a, b -> a + b })
    val result2 = add(2, 3) { a, b -> a + b } // 이렇게도 표현 가능
    println(result)
    println(result2)
}