import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1043 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] input = bf.readLine().split(" ");
        bf.close();
        float a = Float.parseFloat(input[0]);
        float b = Float.parseFloat(input[1]);
        float c = Float.parseFloat(input[2]);

        // processamento & saida
        if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("Perimetro = %.1f\n", (a + b + c));
        } else {
            System.out.printf("Area = %.1f\n", ((a + b) * c) / 2);
        }
    }
}
