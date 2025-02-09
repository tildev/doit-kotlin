package chap08.section1

class GenericNull<T> { // 기본적으로 null 이 허용되는 형식 매개변수
    fun equalityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

class GenericNotNull<T : Any> { // 자료형 Any 가 저장되어 null 을 허용하지 않음
    fun equalityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2)) // non-null 이라 null 허용 ? 기호 사용시 warning
    }
}

fun main() {
    val obj = GenericNull<String>() // non-null 로 선언
    obj.equalityFunc("Hello", "World") // null 이 허용되지 않음

    val obj2 = GenericNull<Int?>() // null 이 가능한 형식으로 선언
    obj2.equalityFunc(null, 10) // null 사용

    // val objNotNull = GenericNotNull<Int?>() // 오류. null 허용되지 않기 때문에 ? 기호 사용불가
    val objNotNull = GenericNotNull<Int>() // 오류. null 허용되지 않음.
}