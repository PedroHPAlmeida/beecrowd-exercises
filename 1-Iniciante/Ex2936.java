import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2936 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis e objetos
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int[] nPorcoes = new int[5];
        int[] porcoes = { 300, 1500, 600, 1000, 150 };

        // entrada & processamento
        int total = 0;
        for (int i = 0; i < 5; i++) {
            String aux = bf.readLine();
            nPorcoes[i] = Integer.parseInt(aux);
            total += (porcoes[i] * nPorcoes[i]);
        }
        total += 225;

        // saida
        System.out.println(total);
    }
}