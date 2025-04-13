package chap11.section4.mutex

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.coroutines.CoroutineContext
import kotlin.system.measureTimeMillis

val mutex = Mutex()
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
    massiveRun(Dispatchers.Default) {
        mutex.withLock {
            counter++ // 임계 구역 코드
        }
    }

    println("Counter = $counter")
}