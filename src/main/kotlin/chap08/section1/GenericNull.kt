package chap08.section1

class GenericNull<T> {
    fun equalityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>() // non-null 로 선언
    obj.equalityFunc("Hello", "World") // null 이 허용되지 않음

    val obj2 = GenericNull<Int?>() // null 이 가능한 형식으로 선언
    obj2.equalityFunc(null, 10) // null 사용
}

