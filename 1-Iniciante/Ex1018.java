import java.util.Locale;
import java.util.Scanner;

public class Ex1018 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "BR"));

        // entrada
        int valor = scanner.nextInt();

        // processamento & saida
        double[] cedulas = { 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0 };

        System.out.println(valor);
        for (double cedula : cedulas) {
            int nCedula = (int) (valor / cedula);
            valor %= cedula;
            System.out.format("%d nota(s) de R$ %.2f\n", nCedula, cedula);
        }
        scanner.close();
    }
}
