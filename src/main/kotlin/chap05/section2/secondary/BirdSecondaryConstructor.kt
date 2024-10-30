package chap05.section2.secondary

import chap05.section2.primary.Bird

class Bird {
    var name: String
    var wing: Int
    var beak: String
    var color: String

    /* constructor(name: String, wing: Int, beak: String, color: String) {
         this.name = name
         this.wing = wing
         this.beak = beak
         this.color = color
     }*/

    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name
        wing = _wing
        beak = _beak
        color = _color
    }

    constructor(_name: String, _beak: String) {
        name = _name
        wing = 2
        beak = _beak
        color = "grey"
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird("mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)

    val bird1 = Bird("mybird2", "long")

}