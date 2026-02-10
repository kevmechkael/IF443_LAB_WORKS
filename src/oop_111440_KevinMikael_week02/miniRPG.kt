package oop_111440_KevinMikael_week02
import java.util.Scanner
class Hero(
    var name: String,
    var baseDamage :Int,
    var hp : Int = 100
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
    }
    fun isalive() : Boolean{
        return hp > 0
    }
}
fun main(){
    val scanner = Scanner(System.`in`)
    var hpMusuh: Int = 100
    print("masukan nama hero : ")
    val nama: String = scanner.nextLine()
    print("masukan damage hero : ")
    val damage = scanner.nextInt()
    val game = Hero(nama, damage)
    while(game.isalive()){
        println("serang(1) atau kabur (2)")
        val choice = scanner.nextInt()
        if (choice == 1){
            game.attack("zombie")
            hpMusuh -= damage
            println("hp zombie = $hpMusuh")
            if (hpMusuh <= 0){
                println("kau menang")
                break
            }
            game.takeDamage((10..20).random())
        }else if(choice==2){
            break
        }else{
            println("salah input tetap terkena damage")
            game.takeDamage((10..20).random())
        }
    }

    if (game.hp > hpMusuh){
        print("kamu menang")
    }else if(game.hp < hpMusuh){
        print("kamu kalah")
    }else(
        print("seri")
    )
}