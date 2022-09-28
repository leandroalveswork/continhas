import kotlin.math.pow

fun main(args: Array<String>) {
    println("Bem-vindo ao Continhas v1.0!")
    val capitalizacao1Servico = Capitalizacao1()
    capitalizacao1Servico.calcularValorFuturoCap52000()
}

fun testarNumeroCef() {
    val n1 = NumeroCef(5.4)
    n1.arredondarCasas(4)
    val n2 = NumeroCef(60.044)
    n2.arredondarCasas(4)
    val n3 = NumeroCef(60.0)
    n3.arredondarCasas(4)
    val n4 = NumeroCef(10.0044)
    n4.arredondarCasas(4)
    val n5 = NumeroCef(530.041999)
    n5.arredondarCasas(4)
    val n6 = NumeroCef(610.5107800404)
    n6.arredondarCasas(4)
    val n7 = NumeroCef(777.5107800404)
    n7.arredondarCasas(4)
    val n8 = NumeroCef(888.510050003)
    n8.arredondarCasas(4)
    val n9 = NumeroCef(530.04222222)
    n9.arredondarCasas(4)

    println(n1.numero)
    println(n2.numero)
    println(n3.numero)
    println(n4.numero)
    println(n5.numero)
    println(n6.numero)
    println(n7.numero)
    println(n8.numero)
    println(n9.numero)
}