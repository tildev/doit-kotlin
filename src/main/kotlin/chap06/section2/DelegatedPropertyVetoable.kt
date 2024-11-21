package chap06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue > oldValue
    }

    println(max)
    max = 10
    println(max)

    // 여기서는 기존값이 새 값보다 크므로 false. 따라서 5를 재할당하지 않음.
    max = 5
    println(max)

    max = 11
    println(max)
}