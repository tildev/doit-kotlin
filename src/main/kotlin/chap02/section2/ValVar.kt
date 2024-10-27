package chap02.section2

fun main() {
    val number = 10
    var language = "Korean"
    val secondNumber: Int = 20
    language = "English"

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")

    val intValue = 127
    val intValue2 = -32768
    val intValue3 = 2147483647
    val longValue = 9223372036854775807

    val typeInt = 123
    val typeLong = 123L
    val typeInt2 = 0x0F
    val typeInt3 = 0b00001011

    val exp08: Byte = 127
    val exp09 = 32767
    val exp10: Short = 32767

    val uint: UInt = 153u
    val ushort: UShort = 65535u
    val ulong: ULong = 46322342uL
    val ubyte: UByte = 255u

    val num = 1_000_000
    val cardNum = 1234_1234_1234_1234L
    val hexVal = 0xAB_CD_EF_12
    val bytes = 0b1101_0010

    val exp01 = 3.14
    val exp02 = 3.14F
    val exp03 = 3.14E-2
    val exp04 = 3.14e2
}