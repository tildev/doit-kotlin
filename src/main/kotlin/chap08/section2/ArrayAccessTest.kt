package chap08.section2

import java.util.*


fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr: ${arr.contentToString()}")
    println("size: ${arr.size}")
    println("sum(): ${arr.sum()}")

    println(arr.get(2))
    println(arr[2])

    arr.set(2, 7)
    arr[0] = 8
    println("size: ${arr.size}, arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    for (i in arr.indices) {
        println("arr[$i] = ${arr[i]}")
    }
    val intArr = intArrayOf(1, 2, 3, 4, 5)
    println(intArr.contentToString())

    val array = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6, 7)
    )
    println(Arrays.deepToString(array))

    val arr3 = Array(5, { i -> i * 2 })
    println("arr3: ${Arrays.toString(arr3)}")

    var a1 = arrayOfNulls<Int>(1000) // 1000 개의 null 로 채워진 정수 배열
    var a2 = Array(1000, { 0 })

    val a = Array(10, { i -> MyClass(i) })
    for (i in a.indices) {
        println("a[$i] = ${a[i]}")
    }

    val arr4 = intArrayOf(1, 2, 3, 4, 5)
    val arr5 = arr4.plus(6)
    println("arr5: ${arr5.contentToString()}")

    val arr6 = arr4.sliceArray(0..2)
    println("arr6: ${arr6.contentToString()}")

    println(arr6.first())
    println(arr6.last())

    println("indexOf(2): ${arr6.indexOf(2)}")
    println("average: ${arr6.average()}")
    println("count: ${arr6.count()}")
    println("reverse: ${arr6.reversedArray().contentToString()}")

    println(arr6.contains(2))
    println(2 in arr6)

}

class MyClass(private val number: Int) {
    override fun toString() = "MyClass(number=$number)"
}