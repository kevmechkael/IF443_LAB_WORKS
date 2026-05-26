package oop_111440_KevinMikael_week14

class UserValidator{
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 10
}

class userRepository{
    fun save(user: User){
        println("saving User : ${user.name} to database")
    }
}