package oop_111440_KevinMikael_week05

class CreditCard(accountName: String, var limit: Double, var usedAmount: Double = 0.0):PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        val checker = amount + usedAmount
        if ( checker <= limit ){
            usedAmount = checker
        }else{
            println("no way brokie")
        }
    }
}