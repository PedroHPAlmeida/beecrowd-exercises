import java.util.Scanner;

public class Ex1183 {
    public static final int ORD = 12;

    public static void main(String[] args) {
        // variaveis & objetos
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double[][] m = new double[ORD][ORD];
        double soma = 0;

        //entrada & processamento
        String t = sc.nextLine();
        for (int i = 0; i < ORD; i++) {
            for (int j = 0; j < ORD; j++) {
                m[i][j] = sc.nextDouble();
                if (j > i) {
                    soma += m[i][j];
                    n++;
                }
            }
        }

        // saida
        if (t.equals("S")) {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", soma / (float) n);
        }
    }
}