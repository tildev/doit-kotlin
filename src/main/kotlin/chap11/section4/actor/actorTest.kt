package chap11.section4.actor

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.actor
import kotlin.system.measureTimeMillis

suspend fun massiveRun(action: suspend () -> Unit) {
    val n = 1000
    val k = 1000
    var time = 0L
    coroutineScope {
        time = measureTimeMillis {
            val jobs = List(n) {
                launch {
                    repeat(k) { action() }
                }
            }
            jobs.forEach { it.join() }
        }
    }
    println("Completed ${n * k} actions in $time ms")
}

sealed class CounterMsg {
    data object IncCounter : CounterMsg() // counter 를 증가하기 위한 단방향 메시지
    class GetCounter(val response: CompletableDeferred<Int>) : CounterMsg() // 응답 채널의 요청
}

@OptIn(ObsoleteCoroutinesApi::class)
fun CoroutineScope.counterActor() = actor<CounterMsg>(Dispatchers.Default) {
    var counter = 0 //actor 의 상태로 공유되지 않음
    for (msg in channel) { // 들어오는 메시지 처리
        when (msg) {
            is CounterMsg.IncCounter -> counter++
            is CounterMsg.GetCounter -> msg.response.complete(counter)
        }
    }
}

fun main(): Unit = runBlocking {
    val counter = counterActor() // actor 의 생성
    massiveRun {
        counter.send(CounterMsg.IncCounter)
    }
    val response = CompletableDeferred<Int>()
    counter.send(CounterMsg.GetCounter(response))
    println("Counter = ${response.await()}")
    counter.close() //actor 의 중단
}