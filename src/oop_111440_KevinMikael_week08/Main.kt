package oop_111440_KevinMikael_week08

fun main(){
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "kota Tidak Diketahui"
    println("tujuan ke "+destination)
    println("TESTTTTTTTTTTTTTTTTTTTTTT")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let {
        price ->
        val tax = price * 0.11
        "transaksi valid harga : $price, pajak : $tax"
    } ?: "Transaksi Invalid: harga belum di-set"
    println(receipt)
    println("TESTTTTTT 2")
    val mixed : List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("KevinMikael", null),
        "Laptop",
        4500000.0
    )
}