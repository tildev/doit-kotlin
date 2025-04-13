package chap11.section1

// Thread 클래스 직접 상송. 다중 상속이 허용되지 않으므로 Thread 이외의 클래스 상속 불가능
class SimpleThread : Thread() {
    override fun run() {
        println("Current Threads: ${currentThread()}")
    }
}

// Runnable 인터페이스 구현한 것이므로, 다른 클래스 상속 가능
class SimpleRunnable : Runnable {
    override fun run() {
        println("Current Threads: ${Thread.currentThread()}")
    }
}

fun main() {
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    // 익명 객체 사용시, 클래스의 객체를 만들지 않고도 실행가능
    object : Thread() {
        override fun run() {
            println("Current Threads(object): ${currentThread()}")
        }
    }.start()

    Thread({
        println("Current Threads(lambda): ${Thread.currentThread()}")
    }).start()
}