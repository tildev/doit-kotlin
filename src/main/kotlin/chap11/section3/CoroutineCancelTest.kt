package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        try{
            repeat(1000) { i ->
                println("I'm sleeping $i...")
                delay(500L)
            }
        }finally {
            println("Bye!")
            withContext(NonCancellable) { // NonCancellable 문맥에서 작동하면 실행 보장
                println("I'm running finally")
                delay(1000L)
                println("Non-Cancellable") // 1초를 지연해도 취소되지 않음
            }
        }
    }
    delay(1300L)
    job.cancelAndJoin() // 작업을 취소하고 완료될 때까지 기다림
    println("main: Quit!")
}