package oop_111440_KevinMikael_week03
class karyawan{
    private var nama: String = "belum ada"
    private var gaji: Int = 0
    public fun changeNama(name: String) {
        if (name.length == 0) {
            println("name is empty no can do")
        }else{
            this.nama = name
        }
    }
    public fun getNama(): String {
        return nama
    }
    public fun changeGaji(value: Int) {
        if (value < 0) {
            println("Gaji is negative no can do")
        } else {
            this.gaji = value
        }
    }
    public fun getGaji(): Int{
        return gaji
    }
}

fun main(){
    var kry = karyawan()
    kry.changeNama("kevinnnnn")
    println("Nama Kamu : " + kry.getNama())
    kry.changeNama("")
    println("Nama Kamu : " + kry.getNama())
    kry.changeGaji(1)
    println(kry.getGaji())
    kry.changeGaji(-1)
    println(kry.getGaji())
}