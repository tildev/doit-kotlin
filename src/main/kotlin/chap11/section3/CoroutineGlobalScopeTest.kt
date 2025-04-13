package chap11.section3

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking {
    GlobalScope.launch { // 만일 launch 만 사용하면 종료되지 않음. 그러나 GlobalScope 로 생명주기를 한정했기 때문에 1.3초 뒤 종료
        repeat(1000) { i ->
            println("I'm sleeping $i...")
            delay(500)
        }
    }
    delay(1300L)
}