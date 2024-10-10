fun main() {
    var texto:Any? = "10"
    println(texto as String) // cast
    println(texto as? Int)
    println(texto.toInt())
    if (texto is String) {
        println("$texto eh uma String")
    }

    texto = null
    if (texto is String) {
        // sempre false
        println("${texto}")
        println("${texto?.length}")
    }
    
    var numero: Any? = 123
    println(numero as Int)
}