fun main() {
    var inteira = buscaInteiro("10")
    println("Valor recebido = $inteira")
    inteira = buscaInteiro(null)
    println("Valor recebido = $inteira")
    inteira = buscaInteiro(null, 20)
    println("Valor recebido = $inteira")
    inteira = buscaInteiro(valorDefault = 30, s = "30")
    println("Valor recebido = $inteira")
    inteira = buscaInteiro(valorDefault = 40, s = null)
    println("Valor recebido = $inteira")
}

fun buscaInteiro(s: String?, valorDefault: Int = 0): Int {
    if (s != null) {
        return s.toInt()
    }
    return valorDefault
}
