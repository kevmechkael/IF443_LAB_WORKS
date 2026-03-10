package oop_111440_KevinMikael_week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("pay amount $amount using Gopay")
    }
}
class Credit : PaymentMethod {
    override fun pay(amount: Double) {
        println("pay amount $amount using Credit")
    }
}