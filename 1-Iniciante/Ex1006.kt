import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nota1 = scanner.nextDouble()
    val nota2 = scanner.nextDouble()
    val nota3 = scanner.nextDouble()

    val peso1 = 2
    val peso2 = 3
    val peso3 = 5

    val media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3)

    println("MEDIA = ${String.format("%.1f", media)}")
}
