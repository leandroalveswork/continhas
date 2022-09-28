class Impostos {
    fun calcular1000DentroIcms17() {
        val valorInicial = 1000 / 1.17
        val valorInicialAsCef = NumeroCef(valorInicial)
        valorInicialAsCef.arredondarCasas(4)
        println(valorInicialAsCef.numero)
    }
    fun calcular1204_82DentroIcms17() {
        /*
        * IPI tem como base o valor inicial + ICMS aplicado sobre o preço final (inicial + proprio IPI + ICMS)
        * final = (inicial + picms) * (1 + ipi)
        * final = (inicial + final * icms) * (1 + ipi)
        *
        * preço + IPI de 10% = 1204,82
        *
        * final = inicial * (1 + ipi) + picms * (1 + ipi)
        * final = 1204_82 + picms * (1 + ipi)
        * final = 1204_82 + final * icms * (1 + ipi)
        * - 1204_82 = final * (icms * (1 + ipi) - 1)
        *
        * */
        val precoFinal = -1204.82 / (0.17 * (1.10) - 1)
        val precoFinalAsCef = NumeroCef(precoFinal)
        precoFinalAsCef.arredondarCasas(4)
        println(precoFinalAsCef.numero)
    }
}