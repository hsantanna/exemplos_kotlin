fun main() {

    var mapa = HashMap<Char, String>()

    for (caractere in 'A' .. 'F') {

        var binario = Integer.toBinaryString(caractere.code)

        mapa[caractere] = binario

    }

    mapa.put('G', "99999")

   println("Imprimindo o conteudo do mapa")

    for ( (letra, bin) in mapa ) {

        println(" mapa [ $letra ] = $bin " )

    }

}