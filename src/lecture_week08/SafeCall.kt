package lecture_week08

class alamat(val alamat: String?)
class Mahasiswa(val address : alamat)

fun main(){
    val mhs1 = Mahasiswa(alamat("Dmitry"))
    val mhs2 = Mahasiswa(alamat(null))
    println(mhs1.address.alamat)
    println(mhs2.address.alamat)
    val tetapAlamat = alamat(null)
    println("kamu di " + tetapAlamat.alamat)
    val defaultAlamat = tetapAlamat.alamat?.let{
        adrs->"alamat adalah $adrs"
    } ?: "mampus ga ada rumah"
    println(defaultAlamat)
}