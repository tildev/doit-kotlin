package chap10.section1

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    val user = User("Kildong", "default")

    val result = with(user) {
        skills = "Kotlin"
        email = "Kildong@exmaple.com"
    }
    println(user)
    println("result: $result")
}