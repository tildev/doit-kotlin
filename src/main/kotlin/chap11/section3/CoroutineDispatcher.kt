package chap11.section3

import kotlinx.coroutines.*

@OptIn(ExperimentalCoroutinesApi::class, DelicateCoroutinesApi::class)
fun main() = runBlocking {
    val jobs = arrayListOf<Job>()
    jobs +=launch(Dispatchers.Unconfined) { // 메인 스레드에서 작업
        println("Unconfined:\t\t ${Thread.currentThread().name}")
    }
    jobs +=launch(coroutineContext) { // 부모의 문맥, 여기서는 runBlocking의 문맥
        println("coroutineContext:\t\t ${Thread.currentThread().name}")
    }
    jobs +=launch(Dispatchers.Default) { // 디스패치의 기본값
        println("Default:\t\t ${Thread.currentThread().name}")
    }
    jobs +=launch(Dispatchers.IO) { // 입출력 중심의 문맥
        println("IO:\t\t ${Thread.currentThread().name}")
    }
    jobs +=launch { // 아무런 인자가 없을 때
        println("main runBlocking:\t\t ${Thread.currentThread().name}")
    }
    // 새 스레드를 생성
    newSingleThreadContext("MyThread").use { myThread ->
        jobs += launch(myThread) {
            println("MyThread:\t\t ${Thread.currentThread().name}")
        }
    }
    jobs.forEach { it.join() }
}