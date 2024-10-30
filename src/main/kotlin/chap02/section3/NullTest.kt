package chap02.section3

fun main() {
    var str1: String = "Hello Kotlin"
    // 오류. null 을 허용하지 않음
    // str1 = null
    println("str1: $str1")

    // null 할당을 허용하려면 자료형 뒤에 물음표(?) 기호를 명시해야 함.
    var str2: String? = "Hello Kotlin"
    str2 = null
    println("str2: $str2")
    // .length 불가능. null 을 허용하면 length 가 실행될 수 없음.
    //println("str2: $str2 length: ${str2.length}")
    // 세이프 콜 로 안전하게 호출 가능.
    println("str2: $str2 length: ${str2?.length}")
    // not null 단정기호 !! 를 사용하여 NPE 발생시킬 수 있음.
    // println("str2: $str2 length: ${str2!!}")

    val len = if (str2 != null) str2.length else -1
    println("str2: $str2 length: ${len}")
}