import kotlin.math.pow

class Capitalizacao1 {

    fun calcularValorFuturoCap52000() {
        val montante = 52000 * (1.038.pow(36))
        val montanteAsCef = NumeroCef(montante)
        montanteAsCef.arredondarCasas(4)
        println(montanteAsCef.numero)
    }

    fun calcularMontante550() {
//    val expoen = 1.2.pow(0.3)
//    val expoenAsCef = NumeroCef(expoen)
//    expoenAsCef.arredondarCasas(4)
        val montante = 550 * (1.2.pow(1.0 / 3))
        val montanteAsCef = NumeroCef(montante)
        montanteAsCef.arredondarCasas(4)
        println(montanteAsCef.numero)
    }

    fun calcularJuroCap1500_1_aSemanaPor2Meses() {
//    val expoen = 1.01.pow(8)
//    val expoenAsCef = NumeroCef(expoen)
//    expoenAsCef.arredondarCasas(4)
        val montante = 1500 * (1.01.pow(9))
        val montanteAsCef = NumeroCef(montante)
        montanteAsCef.arredondarCasas(4)
        val juros = montanteAsCef.numero - 1500
        println(juros)
    }

    fun calcularJuroCap1500_8_aoTriPor18Meses() {
        val montante = 1500 * (1.08.pow(6))
        val montanteAsCef = NumeroCef(montante)
        montanteAsCef.arredondarCasas(4)
        val juros = montanteAsCef.numero - 1500
        println(juros)
    }

    fun calcularJuroCap1500_10_aoAnoPor10Anos() {
        val montante = 1500 * (1.1.pow(10))
        val montanteAsCef = NumeroCef(montante)
        montanteAsCef.arredondarCasas(4)
        val juros = montanteAsCef.numero - 1500
        println(juros)
    }

    fun calcularMontanteCap3000_3_75_aoMesPor6Meses() {
        val montante = 3000 * (1.0375.pow(6))
        val montanteAsCef = NumeroCef(montante)
        montanteAsCef.arredondarCasas(4)
        println(montanteAsCef.numero)
    }
}