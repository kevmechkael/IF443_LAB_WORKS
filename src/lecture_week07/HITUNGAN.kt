package lecture_week07

class HITUNGAN private constructor(val tipe:String) {
    companion object {
        const val namaMTK:String= "matematika";
        fun pertambahan(a:Int, b:Int){
            println("hasil pertambahan : "+(a+b))
        }
        fun perkalian(a:Int, b:Int){
            println("hasil perkalian : "+(a*b))
        }
        fun Buat_Data(){
            HITUNGAN("admin")
        }


    }
    init{
        println("isi param class : " + tipe)
    }
}