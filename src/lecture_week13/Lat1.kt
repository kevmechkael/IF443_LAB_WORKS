package lecture_week13

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
data class siswa(val nama: String, val umur: Int, val gpa: Double)
fun siswa.toCSV(): String = "$nama, $gpa, $umur"
fun main(){
    val file = File("src/lecture_week13/contohfile.txt")
    val baca = file.readText()
    println(baca)
    println("\n=================\n")
    val lines = file.readLines()
    lines.forEach {
        println(it)
    }
    println("\n=================\n")
    val line = BufferedReader(FileReader("src/lecture_week13/contohfile.txt"))
    var baris:String? = line.readLine()
    while (baris != null) {
        println(baris)
        baris = line.readLine()
    }
    line.close()
    println("\n=================\n")
    val line2 = BufferedReader(FileReader("src/lecture_week13/contohfile.txt"))
    line2.use{
        baris -> baris.lineSequence().filter{ it.isNotBlank() }.forEach{println(it)}
    }
    println("\n=================\n")
    val filebuat = File("src/lecture_week13/fileBuat.txt")
    filebuat.writeText("baris pertama\n")
    filebuat.appendText("tambah lagi\n")
    val bacaFile = filebuat.readText()
    println(bacaFile)
    println("\n=================\n")
    val Listcontoh = listOf("nasi goreng", "bakpao", "mie")
    filebuat.appendText(Listcontoh.joinToString("\n"))
    filebuat.printWriter().use { out ->
        out.println("halo\n")
    }
    println("\n=================\n")
    val murid = siswa("Budi", 20,3.2)
    println(murid.toCSV())
    val filebuat2 = File("src/lecture_week13/fileBuat.csv")
    filebuat2.writeText(murid.toCSV())
    val dataSiswa = listOf(
        siswa("bang", 20,3.2),
        siswa("bob", 20,3.2),
        siswa("bib", 20,3.2),
        siswa("bub", 20,3.2),
    )
    val data = dataSiswa.joinToString("\n"){ it.toCSV() }
    filebuat2.appendText(data)
}