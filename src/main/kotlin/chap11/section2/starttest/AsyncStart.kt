package chap11.section2.starttest

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

suspend fun doWork1(): String {
    delay(1000)
    return "Work1"
}

suspend fun doWork2(): String {
    delay(3000)
    return "Work2"
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doWork1() }
        val two = async(start = CoroutineStart.LAZY) { doWork2() }

        // val one = async { doWork1() } // Default = CoroutineStart.DEFAULT
        // val two = async { doWork2() }
        println("AWAIT: ${one.await() + "_" + two.await()}")
    }
    println("Completed in $time ms")
}