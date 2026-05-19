package oop_111440_KevinMikael_week13

import java.io.File

fun main(){
    println("=== TEST UNSAFE RESOURCE HANDLING ===")
    val unsafefile = File("unsafe_logs.txt")
    val writer = unsafefile.printWriter()
    writer.println("log 1 : membuka database")
    writer.println("log 2 : menulis data pengguna")
    writer.close()
    println("selesai")
}