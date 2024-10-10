fun buscaInteiro(s: String?, valorDefault: Int = 0): Int {
    if (s != null) {
        return s.toInt()
    }
    return valorDefault
}

fun areaRetangulo(
    base: Double, altura: Double = base): Double {

        
    return base * altura
}


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

    // parâmetros não precisam estar em ordem na chamada da função:
    println(areaRetangulo(altura = 5.0, base = 10.0))
    // podemos ainda especificar apenas o valor para base, pois esta é o valor padrão da altura:
    println(areaRetangulo(base = 30.0))
    // mesmo que:
    println(areaRetangulo(30.0)) // aqui o parâmetro (base) não está nomeado}
}
