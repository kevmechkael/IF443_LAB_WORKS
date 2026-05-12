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
}