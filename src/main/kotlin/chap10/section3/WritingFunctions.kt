package chap10.section3

import java.io.File
import java.io.PrintWriter

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!."
    val path = "${System.getProperty("user.home")}/testfile.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString)
    // File(path).printWriter().use { out -> out.println(outString) }
    // File(path).printWriter().use { it.println(outString) }

    printWriter.close()
}