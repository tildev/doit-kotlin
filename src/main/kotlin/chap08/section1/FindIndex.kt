package chap08.section1

fun <T> find(a: Array<T>, Target: T): Int {
    for (i in a.indices) {
        if (a[i] == Target) return i
    }
    return -1
}

fun main() {
    val arr1: Array<String> = arrayOf("Apple", "Banana", "Cherry", "Durian")
    val arr2: Array<Int> = arrayOf(1, 2, 3, 4)

    println("arr.indices ${arr1.indices}") // indices 는 배열의 유효 범위 반환
    println(find<String>(arr1, "Cherry")) // 요소 Cherry 의 인덱스 찾아내기
    println(find(arr2, 2)) // 요소 2 의 인덱스 찾아내기
    // find 사용시 선언에서 자료형이 특정되어 있는 경우 제네릭 타입 생략 가능
}