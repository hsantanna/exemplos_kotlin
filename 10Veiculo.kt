open class Veiculo (var modelo: String, var ano: Int) {

    open fun cadastrar(codigo: Int) {
        println("Cadastrando o veiculo com o codigo $codigo")
    }

    override fun toString(): String {
        return "Veiculo $modelo, ano $ano"
    }

}


class Motocicleta(modelo: String, ano: Int) : Veiculo(modelo, ano) {

    override fun cadastrar(codigo: Int) {
        super.cadastrar(codigo)
        println("Cadastrando a motocicleta com o codigo $codigo")
    }

}

fun main() {

    val moto1 = Motocicleta("Honda", 2000)

    println(moto1)

    println("Motocicleta: ${moto1.modelo}, ano ${moto1.ano}")

    moto1.cadastrar(1234)

}