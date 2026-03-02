package oop_111440_KevinMikael_week04

open class Developer(name : String, baseSalary:Int, val programmingLanguage : String): Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan bahasa $programmingLanguage")
    }
}