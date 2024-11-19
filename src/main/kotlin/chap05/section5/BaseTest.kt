package chap05.section5

open class Base {
    // 이 클래스에서는 a, b, c, d, e 접근 가능
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4 // 가시성 지시자 기본값은 public

    protected class Nested {
        // 이 클래스에서는 a, b, c, d, e, f 접근 가능
        public val e: Int = 5 // public 생략 가능
        private val f: Int = 6
    }
}

class Derived : Base() {
    // 이 클래스레서는 b, c, d, e 접근 가능
    // a 는 접근 불가
    override val b = 5 // Base 의 b 는 오버라이딩됨 - 상위와 같은 protected 지시자

    fun test() {
        println("b (protected) : $b")
        println("c (internal) : $c")
        println("d (public) : $d")
        println("Nested class e (public): ${Nested().e}")
    }
}

class Other(private val base: Base) {
    // base.a, base.b 접근 불가
    // base.c 와 base.d 는 접근 가능(같은 모듈 안에 있으므로)
    // Base.Nested 는 접근 불가, Nested::e 역시 접근 불가

    fun test() {
        println("c (internal): ${base.c}")
        println("d (public): ${base.d}")
    }
}

fun main() {
    val base = Base()
    val derived = Derived()

    println("---- Derived test() ----")
    derived.test() // Derived 클래스에서 접근 가능한 속성들을 확인


    println("\n---- Other test() ----")
    Other(base).test() // Other 클래스에서 접근 가능한 속성들을 확인
}