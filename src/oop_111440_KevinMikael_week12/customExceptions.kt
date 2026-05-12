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
fun main() {
    val account = BankAccount(50000.0)
    try {
        account.withdraw(100000.0)
        val result = 10 / 0
        println(result)
    } catch (e: InsufficientFundsException) {
        println("Custom Error: ${e.message}")
    } catch (e: ArithmeticException) {
        println("Math Error: ${e.message}")
    } catch (e: Exception) {
        println("General Error: ${e.message}")
    }
}