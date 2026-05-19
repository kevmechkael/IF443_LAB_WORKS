package oop_111440_KevinMikael_week13

import oop_111440_KevinMikael_week09.student
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

fun Student.toCsv(): String = "$name,$age,$gpa"

fun fromCsv(line: String): Student{
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}

fun saveStudent(students : List<Student>, path: String) {
    File(path).writeText(students.joinToString ("\n" ){it.toCsv()})
}
fun loadStudents(path: String) : List<Student>{
    return try{
        File(path).readLines().map{ fromCsv(it) }
    } catch (e: FileNotFoundException){
        println("Error : File tidak ditemkan")
        emptyList()
    }
}
fun main(){
    val students = listOf(
        Student("Alice", 20, 3.2),
        Student("bob",22,2.5)
    )
    saveStudent(students, "students.csv")
    val loaded = loadStudents("students.csv")
    println("=== LOADED STUDENTS DATA ===")
    loaded.forEach { println(it) }
}