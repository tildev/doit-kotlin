package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val jobs = List(100_000) { // 많은 양의 코루틴을 위한 List
        launch {
            delay(1000L)
            println(".")
        }
    }
    jobs.forEach { it.join() } // 모든 jobs 가 완료될떄까지 기다림
}