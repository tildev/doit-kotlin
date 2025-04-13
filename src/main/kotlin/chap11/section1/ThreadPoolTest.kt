package chap11.section1

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


fun processItem(item: String) {
    println("Processing $item on thread: ${Thread.currentThread().name}")
    Thread.sleep(100)
}

fun main() {
    val myService: ExecutorService = Executors.newFixedThreadPool(8)

    // 큰 데이터를 처리할 리스트
    val items = List(100) { "Item-$it" }

    var i = 0
    while (i < items.size) { // 아주 큰 데이터를 처리할 때
        val item = items[i]
        myService.submit {
            processItem(item) // 여기서 아주 긴 시간 동안 처리하는 경우
        }
        i += 1
    }

    myService.shutdown()
    myService.awaitTermination(1, TimeUnit.HOURS)
}
