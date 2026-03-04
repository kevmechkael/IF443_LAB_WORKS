package oop_111440_KevinMikael_week05

fun main(){
    val dosen1 = Dosen("pak dimas", "abc123")
    val admin1 = admin("pak dimsum")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
    println("AKTIVITAS PEGAWAI")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        when(pegawai){
            is Dosen -> {
                println("terdeteksi sebagai doesen (nidn: ${pegawai.nidn}")
            }
            is admin -> {
                println("terdeteksi sebagai admin")
            }
        }
    }
}