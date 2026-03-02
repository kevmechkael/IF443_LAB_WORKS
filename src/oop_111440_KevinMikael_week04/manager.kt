package oop_111440_KevinMikael_week04

open class manager(name : String, baseSalary:Int): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang memimpin rapat")
    }
    override fun calculateBonus():Double{
        return super.calculateBonus() + 500000
    }
}