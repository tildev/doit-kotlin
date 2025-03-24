package chap10.section1

import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    val filePath = "${System.getProperty("user.home")}/output.txt"

    PrintWriter(FileOutputStream(filePath)).use {
        it.println("hello")
    }
}