package oop_111440_KevinMikael_week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value){
            if (value < 0){
                println("masa gaji gaada")
                field = 0
            } else {
                field = value
            }
        }
    private var perfomanceRating: Int = 3

    fun increasePerfomanceRating(){
        perfomanceRating++
        println("kinerja meningkat Rating : $perfomanceRating")
    }

    fun printStatus(){
        println("karyawan : $name, rating : $perfomanceRating")
    }
}