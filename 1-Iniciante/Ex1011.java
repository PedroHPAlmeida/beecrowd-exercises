import java.util.Scanner;

public class Ex1011 { //para ser aceito no Beecrowd mude o nome da classe para Main

    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);
        Double volume;
        final Double PI = 3.14159;

        // entrada
        Double raio = scanner.nextDouble();

        // processamento
        volume = (4.0 / 3) * PI * Math.pow(raio, 3);

        // saida
        System.out.printf("VOLUME = %.3f\n", volume);
        scanner.close();
    }
}
