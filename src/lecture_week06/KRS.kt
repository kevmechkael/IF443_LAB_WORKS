package lecture_week06

class KRS(override val nama: String, override val namaSiswa:String) : mahasiswa, siswa {
    override fun belajar() {
        println("si $nama sedang belajar")
        println("si $namaSiswa sedang belajar")
    }
    override fun serang() {
        println("si $nama serang orang")
    }
    override fun mati() {
        println("si $nama mati")
    }
    override fun maingame(){
        super<siswa>.maingame()
    }
}