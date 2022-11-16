fun main() {
    var lista = converterLista("Brasil", "Uruguai", "Argentina", "Paraguai")
    println(lista)
    var lista2 = converterLista(1, 2, 3, 4)
    println(lista2)
}

fun <G> converterLista(vararg parametros : G): List<G> {
    var listaLocal = ArrayList<G>()
    for (elemento in parametros) {
        listaLocal.add(elemento)
    }
    return listaLocal
}

