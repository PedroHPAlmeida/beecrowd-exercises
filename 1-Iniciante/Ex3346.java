import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3346 {
    public static void main(String[] args) throws IOException {
        // objetos & variaveis
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] input = bf.readLine().split(" "); 
        bf.close();
        double f1 = (Double.parseDouble(input[0]) / 100) + 1;
        double f2 = (Double.parseDouble(input[1]) / 100) + 1;

        // processsamento
        double flutuacao = ((f1 * f2) - 1) * 100;

        // saida
        System.out.printf("%.6f\n", flutuacao);
    }
}
