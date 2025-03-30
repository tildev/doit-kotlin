package chap10.section3

import java.io.*

fun main() {
    val path = "${System.getProperty("user.home")}/Over the rainbow.txt"

    try {
        val read = FileReader(path)
        println(read.readText())
    } catch (e: Exception) {
        println(e.message)
    }

    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val inputStreamReader = InputStreamReader(inputStream)
    val sb = StringBuilder()
    var line: String?
    val br = BufferedReader(inputStreamReader)
    try {
        line = br.readLine()
        while (line != null) {
            sb.append(line, '\n')
            line = br.readLine()
        }
        println(sb)
    } catch (e: Exception) {
    } finally {
        br.close()
    }
}