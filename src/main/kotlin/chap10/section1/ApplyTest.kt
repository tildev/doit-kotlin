package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)

    var person = Person("Kildong", "Kotlin")
    person.apply { this.skills = "Swift" } // this 는 person 을 가르킴
    // person.apply { skills = "Swift" } // this 로 받고 생략
    println(person)

    val returnObj = person.apply {
        name = "Sean"
        skills = "Java"
    }
    println(person)
    println(returnObj)
}