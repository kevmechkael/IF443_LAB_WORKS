package lecture_week10

//non generic

class nongenerik(var hasil : Any)

//generic

class generik<T>(var hasil : T)

//generic 2 params

class kota<T,V>(var KodePos: T, var telp:V)

// generic function

fun <T> cobaFungsi(angka: T) : T{
    return angka
}

fun <T: Number> sum(a:T):Int {
    return a.toInt() + 2
}

// generic fun in class

class kalk<T : Number>(val a : T,val b : T){
    fun kali():Double{
        return a.toDouble() * b.toDouble()
    }
    fun bagi():Double{
        return a.toDouble() / b.toDouble()
    }
}

fun main(){

    println("========non generik=========")

    val ngen = nongenerik(1)
    val nGen2 = ngen.hasil as Int
    println(nGen2 + 222)
    println("========generik=========")

    val gen = generik(5)
    println(gen.hasil + 111)

    println("========generik 2 params========")
    val Gen2 = kota(5,"+1010101010100")
    println(Gen2.KodePos)
    println(Gen2.telp)

    println("========generik fun==========")
    println(cobaFungsi(1))

    println(sum(2.10321))
    println("========generik fun in class==========")

    val kalkulator = kalk(10,10)
    println(kalkulator.kali())
    println(kalkulator.bagi())
}