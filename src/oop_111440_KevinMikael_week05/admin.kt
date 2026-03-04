package oop_111440_KevinMikael_week05

class admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("$nama sedang duduk di depan komputer")
    }

    fun doAdminWork(){
        println("$nama  merekap data absensi mahasiswa")
    }
}