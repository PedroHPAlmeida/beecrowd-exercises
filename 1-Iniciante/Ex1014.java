import java.util.Scanner;

public class Ex1014 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);

        // entrada
        int distanciaPercorridaKm = scanner.nextInt();
        float combustivelGasto = scanner.nextFloat();

        // processamento & saida
        System.out.printf("%.3f km/l\n", distanciaPercorridaKm / combustivelGasto);
        scanner.close();
    }
}