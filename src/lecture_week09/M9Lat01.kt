package lecture_week09

fun main() {
    println("================== list of ========================")
    var arMHS = listOf("budi", "susi", "tutis")
    println(arMHS)
    println(arMHS.size)
    println(arMHS[1])
    println(arMHS[2])
    println(arMHS[0])
    for (i in arMHS.indices) {
        println(arMHS[i])
    }
    println("==================== mutable list of ========================")
    var arangka = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(arangka)
    arangka.add(7777)
    println(arangka)
    println(arangka.size)
    arangka[8] = 3
    println(arangka)
    arangka.removeAt(1)
    println(arangka)
    println("==================== SET OF ====================")
    var arUrutan = setOf(1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8)
    println(arUrutan)
    println("ada angka 2 ga? " + arUrutan.contains(2))
    println("================ mutable set of ========================")
    var arMakanan = mutableSetOf("nasi", "mie", "ayam", "ayam")
    println(arMakanan)
    arMakanan.add("nasi lagi")
    println(arMakanan)
    arMakanan.remove("nasi lagi")
    println(arMakanan)
    println("=======================map of===========================")
    var arSiswa = mapOf(
        "ada" to 1,
        "gus" to 2,
        "kris" to 3
    )
    println(arSiswa)
    println(arSiswa["nasi"])
    println(arSiswa.keys)
    println(arSiswa.values)
    println(arSiswa.keys.elementAt(0))
    println("======================== mutable map of =========================")
    var arMenu = mutableMapOf(
        "nasi" to 3,
        "mie" to 4,
        "sayur asem" to 5
    )
    println(arMenu)
    arMenu.put("bakar ayam", 7)
    arMenu["mie"] = 8
    arMenu.remove("mie")
    println(arMenu)

    println("==================== lambda function ====================")
    var sum = { x: Int, y: Int -> x + y }
    println(sum(100000000, 2))
    println("=================== implicit it function =========================")
    var pangkat: (Int) -> Int = { it * it }
    println(pangkat(4))
    println("=================== for each ================")
    arMenu.forEach{ menu -> println(menu) }
    for(sis in arSiswa){
        println(sis)
    }
    val price = listOf("alex","alexander")
    val strings = price.sortedBy{it.length}
    println(strings)
}