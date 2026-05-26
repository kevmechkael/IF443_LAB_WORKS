package oop_111440_KevinMikael_week14

interface MultifuncionDevice{
    fun print(doc: String)
    fun scan(doc: String): String
    fun fax(doc: String)
}

class SimplePrinter : MultifuncionDevice{
    override fun print(doc: String) = println("printing $doc")
    override fun scan(doc: String) = throw UnsupportedOperationException("no Scanner")
    override fun fax(doc: String) = throw UnsupportedOperationException("no Fax")
}