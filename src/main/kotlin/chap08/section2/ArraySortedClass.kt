package chap08.section2

import chap08.section2.sortwith.Product

data class Product(val nane: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("Snow Ball", 870.00),
        Product("Smart Phone", 990.00),
        Product("Drone", 240.00),
        Product("Mouse", 333.55),
        Product("Keyboard", 125.99),
        Product("Monitor", 1500.99),
        Product("Tablet", 512.99),
    )
    products.sortBy { it.price } // 값에 따라 정렬
    products.forEach { println(it) }
}