package oop_111440_KevinMikael_week02

class Student (
    val name: String,
    val nim: String,
    var major: String
){
    init {
        if (nim.length != 5){
            println("WARNING: Objek tercipta dengan ($nim) yang tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        } else {
            println("log : objek Student$name berhasil dialokasikan di memory")
        }
    }
    constructor(name: String, nim: String) : this(name, nim, "non-matriculated"){
        println("LOG : menggunakan constructor jalur umum")
    }
}

