package oop_111440_KevinMikael_week03
fun main(){
    val e = Employee("budi")
    e.salary = -1000
    e.salary = 5000
    println("gaji = " + e.salary)
    e.increasePerfomanceRating()
    println("pajaknya = " + e.tax)
}
