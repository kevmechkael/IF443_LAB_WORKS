package oop_111440_KevinMikael_week07

enum class SystemStates {
    STARTING, RUNNING, STOPPED
}
sealed class ApiResponse{
    data class Success(val data: String) : ApiResponse()
    data class error(val message: String) : ApiResponse()
    object Loading: ApiResponse()
}
