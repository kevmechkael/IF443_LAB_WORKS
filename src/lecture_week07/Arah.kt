package lecture_week07

enum class Arah (val petunjuk: String){
    atas("naik"),
    bawah("turun"),
    kiri("kiri"),
    kanan("kanan");

    fun tampilkanArah(){
        println("arah ke " + petunjuk)
    }
}