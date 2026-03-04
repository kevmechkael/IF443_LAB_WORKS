package oop_111440_KevinMikael_week05

class Ewallet(accountName: String, var balance: Double):PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (amount < balance) {
            balance -= amount
            println("sukses")
        } else {
            println("saldo tak cukup")
        }
    }
    fun topup(amount: Double) {
        balance += amount
        println("sukses")
    }
}