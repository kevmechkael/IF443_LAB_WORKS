package oop_111440_KevinMikael_week06

fun processCheckout(method: PaymentMethod, amount: Double){
    print("-> memulai checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()
    val myPhone = SmartPhone()
    myPhone.turnOn()
    val pay1 = Gopay()
    val pay2 = Credit()

    processCheckout(pay1, 500000.0)
    processCheckout(pay2, 500000.0)
}