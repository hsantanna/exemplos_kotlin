class MinhaClasse {

    fun somar(x: Int, y:Int) {
        val s  = x + y
        println(s)
    }

    fun somar(x: Int, y:Int, acao : MinhaInterface) {
        val s  = x + y
        acao.executar(s)
    }

    inline fun somar(x: Int, y:Int, acao : (Int) -> Unit) {
        val s  = x + y
        acao(s)
    }

}

interface MinhaInterface {
    fun executar(soma: Int)
}

fun main() {

    val minhaClasse = MinhaClasse()
    minhaClasse.somar(5, 6)

    minhaClasse.somar(5, 6, object : MinhaInterface {
        override fun executar(soma: Int) {
            println(soma)
        }
    })

    val minhaLambda : (Int) -> Unit = { s: Int -> println(s) }
    minhaClasse.somar(5, 6, minhaLambda)
}