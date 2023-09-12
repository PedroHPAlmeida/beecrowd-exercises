import java.util.Scanner;
import java.util.Arrays;

public class Ex1042 { //para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis
        Scanner scanner = new Scanner(System.in);
        String valores;
        String[] valoresSeparados;
        int[] vetOriginal = new int[3], vetOrdenado = new int[3];

        // entrada
        valores = scanner.nextLine();
        valoresSeparados = valores.split("\\s");

        // processamento
        for (int i = 0; i < valoresSeparados.length; i++) {
            vetOriginal[i] = Integer.parseInt(valoresSeparados[i]);
        }
        vetOrdenado = vetOriginal.clone();
        Arrays.sort(vetOrdenado);

        // saida
        imprimeVet(vetOrdenado, 3);
        System.out.println();
        imprimeVet(vetOriginal, 3);
        scanner.close();
    }

    public static void imprimeVet(int vet[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(vet[i]);
        }
    }
}