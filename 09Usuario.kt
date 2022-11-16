data class Usuario(val nome : String = "", val idade : Int = 0)

fun main() {

    val henrique = Usuario(nome = "Henrique", idade = 18)

    println(henrique)

    val novoHenrique = henrique.copy(idade = 20)

    println(novoHenrique)

    val (n, i) = henrique

    println("O nome do usuario eh: $n, com idade: $i")

}
