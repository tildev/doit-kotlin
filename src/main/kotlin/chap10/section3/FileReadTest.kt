package chap10.section3

import java.io.FileReader

fun main() {
    val path = "${System.getProperty("user.home")}/Over the rainbow.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    } catch (e: Exception) {
        println(e.message)
    }
}