package lecture_week14

class proses_khs {
    fun hitung(quiz: Double, aktivitas: Double): Double {
        return (quiz * 0.3) + (aktivitas * 0.7)
    }

    fun nilaiAkhir(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}
class prosesDB{
    fun simpanDB(nim: String, nama: String, nilai: Double):String{
        return "$nim $nama $nilai"
    }
    fun loadDB(nim: String): String{
        return "Berhasil load data : $nim"
    }
}

fun main(){
    val khs = proses_khs()
    val db = prosesDB()
    val nilaitugas = khs.hitung(80.0, 80.0)
    val nilaiakhir = khs.nilaiAkhir(90.0, 80.0, nilaitugas)
    val simpan = db.simpanDB("123","adam",nilaiakhir)
    println(simpan)
    println(db.loadDB("123"))
}