enum class DiasDaSemana(val dia : Int) {

    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7)

}

fun main() {

    for (valor in DiasDaSemana.values()) {
        println("${valor.ordinal}: ${valor}" )
    }

    if (DiasDaSemana.QUINTA.dia == 5) {
        println("encontrou: ${DiasDaSemana.QUINTA}")
    }

}