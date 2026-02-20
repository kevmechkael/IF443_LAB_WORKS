package oop_111440_KevinMikael_week03

class tierWeapon(){
    val name: String = "pedang khusus orang spesial"
    var damage: Int = 0
        set(value) {
            if (value < 0){
                println("damage must be >= 0")
                field = 0
            } else if(value > 1000){
                println("to OP")
                field = 1000
            } else {
                field = value
            }
        }
    val tier: String
        get() = when {
            damage > 800 -> "legendary"
            damage > 500 -> "epic"
            else -> "common"
        }
}