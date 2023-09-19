import java.util.Scanner

class Vendedor(
    val nome: String,
    val totalVendas: Double,
    val salarioFixo: Double
) {

    var salarioComBonus: Double = this.salarioFixo + (this.totalVendas * 0.15)
        private set
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val vendedor = Vendedor(
        nome = scanner.nextLine(),
        salarioFixo = scanner.nextDouble(),
        totalVendas = scanner.nextDouble()
    )

    println("TOTAL = R$ ${String.format("%.2f", vendedor.salarioComBonus)}")
}
