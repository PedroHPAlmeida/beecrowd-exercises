import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex1045 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] input = bf.readLine().split(" ");
        bf.close();

        // processamento
        float[] valores = new float[3];
        for (int i = 0; i < 3; i++) {
            valores[i] = Float.parseFloat(input[i]);
        }
        Arrays.sort(valores);

        float a = valores[2];
        float b = valores[1];
        float c = valores[0];

        // saida
        if (a >= b + c) {
            System.out.printf("NAO FORMA TRIANGULO\n");
        } else {
            // referente aos angulos
            if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.printf("TRIANGULO OBTUSANGULO\n");
            } else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.printf("TRIANGULO ACUTANGULO\n");
            }

            // referente aos tipos
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.printf("TRIANGULO RETANGULO\n");
            } else if (a == b && b == c) {
                System.out.printf("TRIANGULO EQUILATERO\n");
            } else if((a == b && b != c) || (a == c && c != b) || (b == c && c != a)) {
                System.out.printf("TRIANGULO ISOSCELES\n");
            }
        }
    }
}
