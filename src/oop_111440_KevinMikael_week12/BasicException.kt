package oop_111440_KevinMikael_week12

fun main() {
    try {
        val result = 10 / 0
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
    } finally {
        println("Program selesai.")
    }
    val result = try {
        100 / 5
    } catch (e: ArithmeticException) {
        0
    }

    println("Try expression result: $result")
}