import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val (codPeca1, numPecas1, valorUnitPeca1) = scanner.nextLine().split(" ")
    val (codPeca2, numPecas2, valorUnitPeca2) = scanner.nextLine().split(" ")

    val total = numPecas1.toInt() * valorUnitPeca1.toDouble() + numPecas2.toInt() * valorUnitPeca2.toDouble()

    println("VALOR A PAGAR: R$ ${String.format("%.2f", total)}")
}
