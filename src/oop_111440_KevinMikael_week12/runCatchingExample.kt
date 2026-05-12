package oop_111440_KevinMikael_week12

fun main() {
    val result = runCatching {
        "ABC".toInt()
    }
    println(result)
}