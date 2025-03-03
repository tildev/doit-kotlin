package chap09.section3

import java.util.*

fun main() {
    // TreeSet 은 HashSet 보다 성능이 좀 떨어지고, 데이터 추가&삭제에 더 시간이 걸림.
    // 그러나 검색과 정렬이 뛰어남.
    val intsSortedSet: TreeSet<Int> = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet = ${intsSortedSet}")

    intsSortedSet.clear()
    println("intsSortedSet = ${intsSortedSet}")
}