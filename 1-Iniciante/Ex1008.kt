import java.util.Scanner

class Funcionario(
    val numero: Int,
    val horasTrabalhadas: Int,
    val salarioPorHora: Double
) {

    var salario: Double = this.horasTrabalhadas * this.salarioPorHora
        private set
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val funcionario = Funcionario(
        numero = scanner.nextInt(),
        horasTrabalhadas = scanner.nextInt(),
        salarioPorHora = scanner.nextDouble()
    )

    println("NUMBER = ${funcionario.numero}")
    println("SALARY = U$ ${String.format("%.2f", funcionario.salario)}")
}
