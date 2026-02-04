package oop_111440_KevinMikael_week01

fun main(){
    val name: String = "Kevin"
    val score: Int = 80
    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Nama : $name Score : $score")
    println ("status : ${calculate(score)}")
    val studentID: String? = null
    val idLength = studentID?.length ?: 0
    println("Panjang ID : $idLength")
}

fun calculate(score: Int) = if (score > 75) "lulus" else "tidak lulus"