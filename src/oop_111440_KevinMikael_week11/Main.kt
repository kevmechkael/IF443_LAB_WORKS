package oop_111440_KevinMikael_week11

fun main(){
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("=== TEST RUN FUNCTION ===")
    val result = "kotlin".run {
        println("memproses kata: ${this}")
        length * 2
    }
    println("hasil kalkulasi run : $result")
}