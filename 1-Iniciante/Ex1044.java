import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1044 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException{
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] input = bf.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        // processamento & saida
        if (a % b == 0 || b % a == 0) {
            System.out.printf("Sao Multiplos\n");
        } else {
            System.out.printf("Nao sao Multiplos\n");
        }
    }
}
