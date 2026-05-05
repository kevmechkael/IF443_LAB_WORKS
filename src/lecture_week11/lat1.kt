package lecture_week11

import lecture_week07.hasil
import oop_111440_KevinMikael_week11.repeatTimes

fun String.DasarExtension(num : Int): String {
    return "Halo $this".repeatTimes(num)
}
fun String.kapitalHurufPertama(): String {
    var hasil = ""
    hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercase()
        }
    }
    return hasil
}

fun String?.cekNull(): String {
    var hasil = ""
    if (this == null || this.isEmpty()) {
        hasil = "gaboleh kosong"
    }
    return hasil

}


fun main(){
    println("kevin".DasarExtension(1))
    val nama : String = "kevvv kev"
    println(nama.uppercase())
    println(nama.kapitalHurufPertama())
    var password : String? = null
    println(password.cekNull())

    val huruf : String = "UMN"
    huruf.let{
        println(it.length)
        println(it)
    }
    val nilaiKamu = 70.run {
        println(this)
        if(this > 50){
            println("LULUS")
        } else {
            println("GAGAL")
        }
    }
}