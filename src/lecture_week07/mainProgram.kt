package lecture_week07

fun main(){
    println("link ${Koneksi.koneksi}")
    Koneksi.coba_konek_db()

    HITUNGAN.pertambahan(1,2)
    HITUNGAN.perkalian(2,3)
    println(HITUNGAN.namaMTK)
    HITUNGAN.Buat_Data()
    val data = SaveData("Mario",10,100,10)
    println("Nama Char : " + data.namaChar)
    println(data)

    val dataCopy = data.copy(namaChar = "Luigi", CurrentLevel = 100000000)
    println("Nama Char : " + dataCopy.namaChar)
    println(dataCopy)

    println("=== CLASS ENUM ===")
    val arahAtas = Arah.atas
    val arahBawah = Arah.bawah
    val arahKanan = Arah.kanan
    val arahKiri = Arah.kiri
    println(arahAtas.tampilkanArah())
    println(arahBawah)
    println(arahKanan)
    println(arahKiri)

    println("=== class SEALED ===")

    val hasil : hasil = hasil.sukses("berhasil")
    hasil.handleRespond(hasil)
    println(hasil)
}