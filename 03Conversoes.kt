fun main() {
    var texto:String? = "Brasil"
    println(texto as String) // cast
    println(texto as? Int)
    if (texto is String) {
        println("$texto eh uma String")
    }

    texto = null
    println(texto)
    println(texto?.length)

    var numero: Any? = 123
    println(numero as Int)
}