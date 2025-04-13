package chap11.section4.confinement

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

@OptIn(ExperimentalCoroutinesApi::class, DelicateCoroutinesApi::class)
val counterContext = newSingleThreadContext("CounterContext")
var counter = 0

@OptIn(DelicateCoroutinesApi::class)
suspend fun massiveRun(context: CoroutineContext, action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    val time = measureTimeMillis {
        val jobs = List(n) {
            GlobalScope.launch(context) {
                repeat(k) { action() }
            }
        }
        jobs.forEach { it.join() }
    }
    println("Completed ${n * k} actions in $time ms")
}

fun main() = runBlocking {
    /*massiveRun(Dispatchers.Default) {
        withContext(counterContext) { // 단일 스레드에 가둠
            counter++
        }
    }*/

    // 위와 같이 스레드에 가두는 방법은 실행 시간이 많이 걸림.
    // 실행을 조금 더 빠르게 하기 위해서는 massiveRun 에 스레드 가두기를 직접 적용
    massiveRun(counterContext) {
        counter++
    }
    println("Counter = $counter")
}