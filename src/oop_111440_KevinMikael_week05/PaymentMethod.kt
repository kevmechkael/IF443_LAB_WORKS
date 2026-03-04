package oop_111440_KevinMikael_week05

abstract class PaymentMethod(val accountName: String) {
        abstract fun processPayment(amount: Double)
}