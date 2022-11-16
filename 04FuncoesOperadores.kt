fun jogoDaVelha(param: Int) : String {

    return if (param % 2 == 0) "X" else "O"

}

fun enviarMensagem(msg: String?) : String {

    return msg ?: "nada"

}

fun main() {

    println(jogoDaVelha(2))
    println(jogoDaVelha(3))

    println(enviarMensagem("Brasil"))
}

