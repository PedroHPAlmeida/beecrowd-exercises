import java.util.Scanner;

public class Ex1091 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis
        Scanner scanner = new Scanner(System.in);
        int k, n, m, ptDivisorX, ptDivisorY, cont;
        String nums;
        String[] numsSeparados;

        // entrada
        while (true) {
            k = scanner.nextInt(); // numero de casos de teste
            scanner.nextLine(); // esvaziando o buffer
            if (k == 0) { // condicao de parada
                break;
            }

            nums = scanner.nextLine(); // leitura pontos Divisores
            numsSeparados = nums.split("\\s");
            ptDivisorX = Integer.parseInt(numsSeparados[0]);
            ptDivisorY = Integer.parseInt(numsSeparados[1]);

            cont = 0;
            while (cont < k) {
                nums = scanner.nextLine(); // leitura cordenadas Residencias
                numsSeparados = nums.split("\\s");
                n = Integer.parseInt(numsSeparados[0]);
                m = Integer.parseInt(numsSeparados[1]);

                //processamento & saida
                imprimeQuadrante(n, m, ptDivisorX, ptDivisorY);
                cont++;
            }
        }
        scanner.close();
    }

    static void imprimeQuadrante(int n, int m, int ptDivisorX, int ptDivisorY) {
        if (n == ptDivisorX || m == ptDivisorY) {
            System.out.println("divisa");
        } else if (n < ptDivisorX) {
            if (m < ptDivisorY) {
                System.out.println("SO");
            } else {
                System.out.println("NO");
            }
        } else {
            if (m < ptDivisorY) {
                System.out.println("SE");
            } else {
                System.out.println("NE");
            }
        }
    }
}