package oop_111440_KevinMikael_week14
import java.io.File
class BadOrderProcessor{
    private val file = File("orders.csv")
    fun processOrder(itemName: String, basePrice: Double, customerType: String){
        val finalPrice = when (customerType){
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.9
            else -> basePrice
        }
        println("${itemName} $finalPrice")
        file.appendText("${itemName} $finalPrice\n")
        println("$itemName telah dikonfirmasi")
    }
}