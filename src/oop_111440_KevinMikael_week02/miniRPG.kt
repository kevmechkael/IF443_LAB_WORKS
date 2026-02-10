package oop_111440_KevinMikael_week02

class hero(
    var name: String,
    var hp : Int = 100,
    var baseDamage :Int
){
    fun attack(targetName : String){
        println("$name menebas $targetName!")
    }
    fun takeDamage(damage : Int){
        hp -= damage
        if (hp < 0){
            hp = 0
        }
        println("remaining hp : $hp")
        isalive(hp)
    }
    fun isalive(hp : Int) : Boolean{
        if (hp === 0){
            return true
        }else{
            return false
        }
    }
}