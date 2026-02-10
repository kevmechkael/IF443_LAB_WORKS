package oop_111440_KevinMikael_week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN")
    print("masukan nama:")
    val name = scanner.nextLine()
    print("masukan NIM (wajib 5 karakter):")
    val nim = scanner.next()
    scanner.nextLine()
    if(nim.length != 5){
        println("error")
    } else {
        print("masukan jurusan")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("status: pendaftaran selesai")
    }
}
