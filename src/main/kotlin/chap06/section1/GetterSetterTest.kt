package chap06.section1

import chap06.section1.customproperty.User

/*class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
    var age: Int = _age
}*/

class User(val id: Int, var name: String, var age: Int)

fun main() {
    val user = User(1, "Sean", 30)
    val name = user.name
    user.age = 41

    // error
    // user.id = 2

    println("name: $name, ${user.age}")
}