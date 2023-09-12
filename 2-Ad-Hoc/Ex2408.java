import java.util.Scanner;

public class Ex2408 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis e objetos
        Scanner scanner = new Scanner(System.in);
        int[] pontuacoes = new int[3];

        // entrada
        for (int i = 0; i < 3; i++) {
            pontuacoes[i] = scanner.nextInt();
        }

        // processamento
        selection(3, pontuacoes);

        // saida
        System.out.println(pontuacoes[1]);
        scanner.close();
    }

    public static void selection(int n, int v[]) {
        int i, j;
        for (i = 0; i < n - 1; ++i) {
            int min = i;
            for (j = i + 1; j < n; ++j) {
                if (v[j] < v[min])
                    min = j;
            }
            int x = v[i];
            v[i] = v[min];
            v[min] = x;
        }
    }
}