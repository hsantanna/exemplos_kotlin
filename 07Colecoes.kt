fun main() {

    var numeros : MutableList<Int> = mutableListOf(1, 2, 3)

    var numeros2 = mutableListOf(1, 2, 3)

    println(numeros)

    println(numeros2)

    numeros.add(4)

    println(numeros)

    val numeros3 = numeros

    println(numeros3)

    val numeros4 = listOf(1, 2, 3, 4, 5)

    println(numeros4)

}