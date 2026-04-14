package lecture_week08

class ProfilePage(val idProfile: String?, val statusOnline: String?){
    fun gantifoto(filePhoto: String?){
        println("Ganti foto $filePhoto")
    }
}


fun main(){
    var nama: String? = "kev"
    nama = null
    println("nama kamu $nama")
    val profile = ProfilePage("12321321312", null)
    println("id = ${profile.idProfile}  status = ${profile.statusOnline}")
    profile.gantifoto(null)
}