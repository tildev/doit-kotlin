package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch { // job 의 객체를 반환
        delay(1000L)
        println("World!")
    }
    println("Hello")
    job.join() // 명시적으로 코루틴이 완료되기를 기다림. 취소할 경우 job.cancel() 함수를 사용
}