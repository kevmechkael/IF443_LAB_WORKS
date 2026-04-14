package oop_111440_KevinMikael_week08

object DatabaseMock{
    fun findUser(id: Int): UserProfile?{
        return if (id == 1) UserProfile("Testuser", "test@tes.comt") else null
    }
}

fun runMockUnitTest(){
    println("RUNNING UNIT TEST")
    val testuser = DatabaseMock.findUser(1)
    val initial = testuser!!.name.substring(0, 1)
    check(initial == "T"){
        "Test failed INITIAL WROOOOOOOOONGGGGGGG"
    }
    println("Test Passed initial is T")
}