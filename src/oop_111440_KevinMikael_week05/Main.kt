package oop_111440_KevinMikael_week05

fun main(){
//    val dosen1 = Dosen("pak dimas", "abc123")
//    val admin1 = admin("pak dimsum")
//    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
//    println("AKTIVITAS PEGAWAI")
//    for (pegawai in daftarPegawai) {
//        pegawai.bekerja()
//        when(pegawai){
//            is Dosen -> {
//                println("terdeteksi sebagai doesen (nidn: ${pegawai.nidn})")
//            }
//            is admin -> {
//                println("terdeteksi sebagai admin")
//            }
//        }
//    val luasKotak = hitungLuas(28)
//    val luasPersegiPanjang = hitungLuas(50, 20)
//    val luasBulat = hitungLuas(50.1)
//    println(luasKotak)
//    println(luasPersegiPanjang)
//    println(luasBulat)
    val Ewallet = Ewallet("kevin", 50000.0)
    val kredit = CreditCard("kevin", 100000.0)
    val method: List<PaymentMethod> = listOf(Ewallet, kredit)
    for (payment in method){
        payment.processPayment(75000.0)
        when(payment){
            is CreditCard -> {
                payment.processPayment(75000.0)
            }
            is Ewallet -> {
                payment.topup(50000.0)
            }
        }
    }
}