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
    println("\n=== TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("safe_logs.txt")
    safeFile.printWriter().use { out ->
        for (i in 1..100){
            out.println("safe log entry $i : Status OK")
        }
    }
    println("100 log berhasil")
    println("\n=== TEST BUFFERED READER ===")
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach {
            line -> println("steam read: $line")
        }
    }
}