package chap09.section3

fun main() {
    val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals)

    println(animals.add("Dog"))
    println(animals.add("Tiger"))
    println(animals)

    animals.remove("Python")
    println(animals)
}