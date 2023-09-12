import java.util.Scanner;

public class Ex1021v2 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);
        int[] nCedulas = new int[7];
        int[] nMoedas = new int[5];

        int[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };
        int[] moedas = { 50, 25, 10, 5, 1 };

        // entrada
        String[] valores = scanner.nextLine().split("\\.");
        int valorCedula = Integer.parseInt(valores[0]); // parte inteira do valor lido
        int valorMoeda = Integer.parseInt(valores[1]); // parte decimal do valor lido

        // processamento
        nCedulas = separaValores(nCedulas, cedulas, valorCedula);
        nMoedas = separaValores(nMoedas, moedas, valorMoeda);

        // saida
        imprime(nCedulas, nMoedas);

        scanner.close();
    }

    public static int[] separaValores(int nValores[], int[] valores, int x) {
        int i = 0;
        while (x > 0) {
            nValores[i] = x / valores[i];
            x %= valores[i];
            i++;
        }
        return nValores;
    }

    public static void imprime(int vetCed[], int vetMoe[]) {
        double[] cedulas = { 100, 50, 20, 10, 5, 2, 1 };
        double[] moedas = { 0.5, 0.25, 0.10, 0.05, 0.01 };

        System.out.printf("NOTAS:\n");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d nota(s) de R$ %.2f\n", vetCed[i], cedulas[i]);
        }

        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ %.2f\n", vetCed[6], cedulas[6]);

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f\n", vetMoe[i], moedas[i]);
        }
    }
}
