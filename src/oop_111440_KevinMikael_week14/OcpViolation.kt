package oop_111440_KevinMikael_week14

class DiscountCalculator {
    fun calculate(price : Double, type : String) : Double{
        return when(type){
            "student" -> price*0.8
            "member" -> price*0.85
            "employee" -> price*0.7
            else -> price
        }
    }
}