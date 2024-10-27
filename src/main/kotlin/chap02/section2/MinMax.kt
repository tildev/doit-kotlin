package chap02.section2

fun main() {
    println("Byte min: " + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE)
    println("Short min: " + Short.MIN_VALUE + " max: " + Short.MAX_VALUE)
    println("Int min: " + Int.MIN_VALUE + " max: " + Int.MAX_VALUE)
    println("Long min: " + Long.MIN_VALUE + " max: " + Long.MAX_VALUE)
    println("Float min: " + Float.MIN_VALUE + " max: " + Float.MAX_VALUE)
    println("Double min: " + Double.MIN_VALUE + " max: " + Double.MAX_VALUE)

    val isOpen = true
    val isUploaded: Boolean

    val ch = 'c'
    val ch2: Char

    val ch1 = 'A'
    println(ch1 + 1)
    //숫자 선언은 불가능함. 오류
    //val chNum: Char = 65

    val code: Int = 65
    val chFromCode: Char = code.toChar()
    println(chFromCode)

    // 2개 이상의 문자는 Char 타입으로 담을 수 없음.
    //val ch4: Char = 'ab'

    // 유니코드 표기법으로 '한' 이라는 문자 지정
    val ch3 = '\uD55C'


}