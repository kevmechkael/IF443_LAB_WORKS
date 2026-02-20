package oop_111440_KevinMikael_week03

class PlayerLevel(){
    var username: String = ""
    private var xp: Int = 0
    var level: Int = 0
        get() = (xp / 100) + 1
    public fun addXP(amount: Int){
        var count = level
        this.xp += amount
        if (level > count){
            println("LEVEL UP")
        }
    }
}