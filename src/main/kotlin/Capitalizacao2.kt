import kotlin.math.pow

class Capitalizacao2 {
    fun calcularTaxa_0334_AoAno() {
        val taxaAoAno =  1.00334.pow(360)
        val taxaAoAnoAsCef = NumeroCef(taxaAoAno)
        taxaAoAnoAsCef.arredondarCasas(4)
        println(taxaAoAnoAsCef.numero)
    }

    fun calcularTaxaMensalAplicacao40000() {
        val baseObtida = (43894.63 / 40000).pow(0.25)
        val baseObtidaAsCef = NumeroCef(baseObtida)
        baseObtidaAsCef.arredondarCasas(4)
        println(baseObtidaAsCef.numero)
    }
}