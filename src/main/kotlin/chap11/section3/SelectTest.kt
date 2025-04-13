package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.selects.select
import java.util.*

@OptIn(ExperimentalCoroutinesApi::class, DelicateCoroutinesApi::class)
fun main() = runBlocking {
    val routine1 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("A")
    }
    val routine2 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("B")
    }

    // produce 로 만든 2개의 루틴은 무작위로 지정된 시간에 각각 A, B 라는 문자열을 채널에 보냄.
    // 이때 select 블록의 onReceive 를 통해 채널로부터 이 값을 받아 먼저 완성된 결과를 가져옴
    val result = select {
        routine1.onReceive { result -> result }
        routine2.onReceive { result -> result }
    }
    println("Result was $result")
}