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
        print("jalur teguler (1) / jalur umum (2)")
        val type: Int = scanner.nextInt()
        if (type === 1){
            print("masukan jurusan")
            val major = scanner.nextLine()
            Student(name, nim, major)
            println("status: pendaftaran selesai")
        } else if (type === 2){
            Student(name, nim)
            println("pendaftaran selesai")
        } else {
            println("oops")
        }
    }
}
