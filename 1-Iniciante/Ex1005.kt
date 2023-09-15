import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val nota1 = scanner.nextDouble()
    val nota2 = scanner.nextDouble()

    val peso1 = 3.5
    val peso2 = 7.5

    val media = ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2)
    println("MEDIA = ${String.format("%.5f", media)}")
}

