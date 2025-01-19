package chap07.section2.nested

class Outer {
    val ov = 5

    // 정적 클래스 처럼 사용한 코틀린의 중첩 클래스
    // 외부 클래스의 프로퍼티, 메서드에 접근 불가
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello! $nv" // 외부의 ov 에는 접근불가
    }

    fun outside() {
        val msg = Nested().greeting() // 객체 생성 없이 중첩 클래스의 메서드 접근
        println("[Outer]: $msg, ${Nested().nv}") // 중첩 클래스의 프로퍼티 접근
    }

    fun accessOuter() { // 컴패니언 객체는 접근할 수 있음
        println(country)
        getSomething()
    }

    companion object { // 컴패니언 객체는 static 처럼 접근 가능 - 객체 생성 없이 고정적인 메모리
        const val country = "Korea"
        fun getSomething() = println("Get something...")
    }
}

fun main() {
    // static 처럼 객체 생성 없이 사용
    val output = Outer.Nested().greeting()
    println(output)

    // Outer.outside() // 오류! 외부 클래스의 경우는 객체를 생성해야 함
    val outer = Outer()
    outer.outside()
    outer.accessOuter()
}