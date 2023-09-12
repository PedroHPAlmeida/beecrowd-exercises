import java.util.Scanner;

public class Ex2466 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis e objetos
        Scanner scanner = new Scanner(System.in);
        int n, linha;

        // entrada
        n = scanner.nextInt();
        int bolas[] = new int[n];
        leVetor(bolas, n, scanner);

        // processamento
        linha = n - 1;
        while (linha > 0) {
            for (int i = 0; i < linha; i++) {
                bolas[i] = bolas[i] * bolas[i + 1];
            }
            linha--;
        }

        // saida
        if (bolas[0] == 1) {
            System.out.println("preta");
        } else {
            System.out.println("branca");
        }
        scanner.close();
    }

    public static void leVetor(int vet[], int tamVet, Scanner scan) {
        for (int i = 0; i < tamVet; i++) {
            vet[i] = scan.nextInt();
        }
    }
}