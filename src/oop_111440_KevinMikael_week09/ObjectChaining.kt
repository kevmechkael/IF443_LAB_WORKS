package oop_111440_KevinMikael_week09

data class student(val name : String, val gpa : Double)
fun main(){
    val students = listOf(
        student("John Smith", 4.0),
        student("Mary Smith", 3.4),
        student("what", 2.1),
        student("Mary Smith twin", 0.0),
    )
}