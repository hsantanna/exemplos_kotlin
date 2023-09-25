fun jogoDaVelha(param: Int) : String {

    return if (param % 2 == 0) "X" else "O"

}

fun enviarMensagem(msg: String?) : String {

    return msg ?: "nada"

}

fun responder(valor: Boolean) : String {
    return if (valor) "Sim" else "Não"
}

fun main() {

    println(jogoDaVelha(2))  // return: "X"
    println(jogoDaVelha(3))  // return: "O"

    println(enviarMensagem("Brasil")) // imprime: Brasil
    val nulo = null
    println(enviarMensagem(nulo))  // imprime: nada
    println(responder(true))   // imprime: Sim
    println(responder(false))  // imprime: Não
}

