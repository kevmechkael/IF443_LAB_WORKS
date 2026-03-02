package oop_111440_KevinMikael_week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work(){
        println("Employee $name sedang bekerja")
    }
    open fun calculateBonus(): Double{
        return baseSalary * 0.1
    }
}