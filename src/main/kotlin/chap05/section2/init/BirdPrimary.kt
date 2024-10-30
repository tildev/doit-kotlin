package chap05.section2.init

class Bird(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String) {
    init {
        println("----------초기화 블록 시작----------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("---------- 초기화 블록 끝 ----------")
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco1 = Bird(beak = "long", color = "red")
    println("coco1.name: ${coco1.name}, coco1.wing: ${coco1.wing}")
    println("coco1.color: ${coco1.color}, coco1.beak: ${coco1.beak}")

    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
}