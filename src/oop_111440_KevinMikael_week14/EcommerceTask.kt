package oop_111440_KevinMikael_week14
import oop_111440_KevinMikael_week08.Order
import java.io.File
import java.io.FileWriter

//class BadOrderProcessor{
//    private val file = File("orders.csv")
//    fun processOrder(itemName: String, basePrice: Double, customerType: String){
//        val finalPrice = when (customerType){
//            "REGULAR" -> basePrice
//            "VIP" -> basePrice * 0.9
//            else -> basePrice
//        }
//        println("${itemName} $finalPrice")
//        file.appendText("${itemName} $finalPrice\n")
//        println("$itemName telah dikonfirmasi")
//    }
//}

interface OrderRepository{
    fun saveOrder(itemName: String, basePrice: Double, customerType: String)
}
class CsvOrderRepository (val fileName: String = "orders.csv") : OrderRepository{
    override fun saveOrder(itemName: String, basePrice: Double, customerType: String) {
        FileWriter(File(fileName), true).use {
            writer -> writer.append("$itemName $basePrice $customerType\n")
        }
    }
}

interface NotificationService{
    fun sendNotification(itemName : String)
}

class EmailNotifier : NotificationService{
    override fun sendNotification(itemName : String) = println("email terkirim pesanan $itemName Anda telah dikonfirmasi")
}

interface PricingStrategy {
    fun calculatePrice(price: Double): Double
}

class vipPricing : PricingStrategy{
    override fun calculatePrice(price: Double) = price * 0.9
}

class RegularPricing : PricingStrategy{
    override fun calculatePrice(price: Double) = price
}

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService) {
    fun processOrder(itemName: String, basePrice: Double, customerType: String, val PricingStrategy: PricingStrategy) {
        val finalPrice = PricingStrategy.calculatePrice(basePrice)
        val pricingType = PricingStrategy::class.simpleName ?: "Unknown"
        println("Memproses pesanan $itemName seharga $finalPrice")
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}