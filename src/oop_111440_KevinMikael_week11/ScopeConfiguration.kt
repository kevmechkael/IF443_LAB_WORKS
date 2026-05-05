package oop_111440_KevinMikael_week11

data class User(var name: String = "", var age: Int = 0)

fun main(){
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Jack"
        age = 200
    }
}