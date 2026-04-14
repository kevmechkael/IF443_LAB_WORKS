package lecture_week08


fun main(){
    var nama: String? = null
    try{
        println(nama)
        println(nama!!.length)
    } catch (e: NullPointerException){
        println("ada error " + e.message)
    }
    val mixed: List<Any?> = listOf(1, 2, 3, 4, 5, null, 7, 8, 9, "sepuluh")
    for(i in mixed) {
        val hasil = i as? String
        if (hasil != null) {
            println(hasil)
        }
    }
}