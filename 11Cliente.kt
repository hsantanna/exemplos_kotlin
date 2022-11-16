data class Cliente(val nome:String)

object ClienteService {
    fun getClientes() : List<Cliente> {
        val clientes = mutableListOf<Cliente>()
        for (indice in 1..3) {
            val cli = Cliente("Cliente $indice")
            clientes.add(cli)
        }
        return clientes
    }
}

fun main() {
    val clientesRetorno = ClienteService.getClientes()
    for (cli in clientesRetorno) {
        println(cli)
    }
}