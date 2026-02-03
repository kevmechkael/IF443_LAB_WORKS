package oop_111440_KevinMikael_week01

fun main(){
    val name: String = "John Thor"
    val score: Int = 80
    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }
    println("nama = $name, score = $score")
    println("Grade kamu = $grade")
    println(calculateStatus(score))
    print("Tugas Kevin")

}

fun calculateStatus(score: Int) = if (score > 75) "lulus" else "tidak lulus"