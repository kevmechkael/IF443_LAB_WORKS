package oop_111440_KevinMikael_week12

class InsufficientFundsException(message: String) : Exception(message)
class BankAccount(private var balance: Double) {

    fun withdraw(amount: Double) {

        if (amount > balance) {
            throw InsufficientFundsException(
                "Saldo tidak cukup! Saldo saat ini: $balance"
            )
        }

        balance -= amount
        println("Berhasil tarik uang Rp$amount")
    }
}