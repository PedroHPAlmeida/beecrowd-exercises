import java.util.Scanner;

public class Main { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis, objetos & entrada
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int v1 = 0, v2, v3;

        // processamento & saida
        for (int i = 0; i < n; i++) {
            v1++;
            v2 = (int) Math.pow(v1, 2);
            v3 = (int) Math.pow(v1, 3);

            for (int j = 0; j < 2; j++) {
                System.out.printf("%d %d %d\n", v1, v2, v3);
                v2++;
                v3++;
            }
        }

    }
}