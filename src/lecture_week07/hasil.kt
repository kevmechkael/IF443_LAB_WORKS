package lecture_week07

sealed class hasil {

    data class sukses(val data: String): hasil()
    data class error(val ex: Exception): hasil()
    object loading: hasil()

    fun handleRespond(res:hasil){
        when(res){
            is sukses ->{ println("Sukses: " + res.data)}
            is error -> {println("error" + res.ex)}
            is loading -> println("loading")
        }
    }
}
