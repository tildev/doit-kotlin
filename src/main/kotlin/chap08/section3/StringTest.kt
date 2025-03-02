package chap08.section3

fun main() {
    var s = "abcdef"
    println(s.substring(0..1) + "x" + s.substring(3..s.length - 1))

    var s1 = "Hello Kotlin"
    var s2 = "Hello KOTLIN"

    // s1 과 s2 가 같으면 0, s1이 s2 보다 작으면 양수, 그렇지 않으면 음수 반환
    println(s1.compareTo(s2))
    println(s1.compareTo(s2, true))

    val ss = StringBuilder("Hello")
    ss[2] = 'x'
    println(ss)

    ss.append("World")
    println(ss)

    ss.insert(10, "Added")
    println(ss)

    ss.delete(5, 10)
    println(ss)

    val deli = "Welcome to Kotlin"
    val sp = deli.split(" ")
    println(sp)

    val str = "4-3=1"
    println(str.split("-", "="))

    val number: Int = "123".toInt()

    try {
        "12w".toInt()
    } catch (e: NumberFormatException) {
        println(e.printStackTrace())
    }

    try {
        "12w".toIntOrNull()
    } catch (e: NumberFormatException) {
        println(e.printStackTrace())
    }

    val text = "\t You're just too \"good\" to be true\n\tI can't take my eyes off you."
    val uni = "\uAC00"
    println(text)
    println(uni)

    val text01 = """
        |Tell me and I forgot.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimMargin() // trim default 는 |
    println(text01)

    val pi = 3.1415926
    val dec = 10
    val sss = "Hello"

    println("pi = %.2f, %3d, %s".format(pi, dec, sss))
}