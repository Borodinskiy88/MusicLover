package ru.netology

fun main() {
    val musicLover = true
    val sum = 10000
    val discount = if (sum > 10000) {
        sum - (sum / 100 * 5)
    } else if (sum >= 1001 && sum <= 10000) {
        sum - 100
    } else {
        sum
    }
    val finalDiscount = if (musicLover == true) discount - (discount / 100 * 1) else discount
    println(finalDiscount)
}
