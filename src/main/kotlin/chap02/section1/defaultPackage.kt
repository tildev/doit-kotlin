package chap02.section1

import kotlin.math.PI
import kotlin.math.abs
import com.example.edu.Person as User

fun main() {

    //val user1 = Person("Kildong", 30)
    val user1 = User("Kildong", 30)
    val user2 = Person("A123", "Kildong")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)

    val intro: String = "안녕하세요!"
    val num: Int = 20

    println(PI)
    println(abs(-12.6))
    println("intro: $intro, num: $num")
}

class Person(val id: String, val name: String)