package ru.netology

fun main() {
    val musicLover = true
    val sum = 10000
    val discount = if (sum > 10000) {
        sum - (sum / 100 * 5)
    } else if (sum in 1001..10000) {
        sum - 100
    } else {
        sum
    }
    val finalDiscount = if (musicLover) discount - (discount / 100 * 1) else discount
    println(finalDiscount)
}
