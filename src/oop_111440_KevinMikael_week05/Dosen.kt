package oop_111440_KevinMikael_week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang bekerja")
    }
    fun mengajar(){
        println("$nama mengajar mahasiswa")
    }
}