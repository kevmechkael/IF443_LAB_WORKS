package oop_111440_KevinMikael_week08

class NotificationService {
    fun sendEmail(emailAdress: String) {
        println("mengirim ke $emailAdress")
    }
    fun processUser(user: UserProfile){
        if(user.email != null){
            sendEmail(user.email)
        }else{
            println("user ${user.email} tidak memiliki email.")
        }
    }
}