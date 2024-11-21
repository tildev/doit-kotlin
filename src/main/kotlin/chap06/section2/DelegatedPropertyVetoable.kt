package chap06.section2

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("NONAME") { // 프로퍼티 위임
            prop, old, new -> // 람다식 매개변수로 프로퍼티, 기존 값, 새로운 값 지정
        println("$old -> $new") // 이 부분은 이벤트가 발생할 때만 실행
    }
}

fun main() {
    val user = User()
    user.name = "kildong"
    user.name = "Dooly"
}