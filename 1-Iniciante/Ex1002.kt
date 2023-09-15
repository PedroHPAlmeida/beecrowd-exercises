import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val raio = scanner.nextDouble()

    val PI = 3.14159
    val area = PI * raio.pow(2.0)
    println("A=${String.format("%.4f", area)}")
}

