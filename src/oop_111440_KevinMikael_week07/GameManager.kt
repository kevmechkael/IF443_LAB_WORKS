package oop_111440_KevinMikael_week07

object GameManager {
    var isGameRunning: Boolean = false
    fun startgame(){
        if (isGameRunning == true){
            println("game sudah berjalan")
        } else {
            isGameRunning = true
            println("game engine sedang menyala")
        }
    }
}