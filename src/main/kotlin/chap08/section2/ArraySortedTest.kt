package chap08.section2

fun main() {
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)
    val sortedNumbers = arr.sortedArray()
    println("ASC: " + sortedNumbers.contentToString())

    val sortedNumbersDesc = arr.sortedArrayDescending()
    println("DESC: " + sortedNumbersDesc.contentToString())

    // 원본 배열에 대한 정렬
    arr.sort(1, 3) // sort(fromIndex, toIndex)
    println("ORI: " + arr.contentToString())
    arr.sortDescending()
    println("ORI: " + arr.contentToString())

    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()
    println("LST: $listSorted")
    println("LST: $listDesc")

    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(items.contentToString())

}