package oop_111440_KevinMikael_week08

fun main(){
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "kota Tidak Diketahui"
    println("tujuan ke "+destination)
}