package chap07.section3

class Manager {
    operator fun invoke(value: String) {
        println(value)
    }
}

fun main() {
    val manager = Manager()
    manager("Do something for me!") // manager.invoke("...") 형태로 호출되며 invoke 가 생략됨
}