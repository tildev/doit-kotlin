package chap07.section1

abstract class Printer {
    abstract fun print()
}

var myPrinter = object : Printer() {
    override fun print() {
        println("출력합니다.")
    }
}

fun main() {
    myPrinter.print()
}
