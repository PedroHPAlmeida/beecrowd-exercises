import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1172 {
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // entrada & processamento & saida
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x <= 0) {
                vetor[i] = 1;
            } else {
                vetor[i] = x;
            }
            System.out.printf("X[%d] = %d\n", i, vetor[i]);
        }
        br.close();
    }
}