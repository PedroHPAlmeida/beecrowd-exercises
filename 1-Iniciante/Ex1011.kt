import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val raio = scanner.nextDouble()

    val PI = 3.14159
    val volume = (4.0/3) * PI * raio.pow(3)

    println("VOLUME = ${String.format("%.3f", volume)}")
}
