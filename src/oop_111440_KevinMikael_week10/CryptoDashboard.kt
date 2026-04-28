package oop_111440_KevinMikael_week10

fun main(){
    val coinRepo = WalletRepo<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 1.5))
    coinRepo.add(Coin("USDT", 1.5))
}