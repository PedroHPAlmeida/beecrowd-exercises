import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Ex2381 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]) throws IOException {
        // variaveis
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(in);
        String nums;
        String[] numsSeparados;
        String[] listaAlunos;
        int n, k;

        // entrada
        nums = entrada.readLine();
        numsSeparados = nums.split("\\s");
        n = Integer.parseInt(numsSeparados[0]);
        k = Integer.parseInt(numsSeparados[1]);

        // processamento
        listaAlunos = new String[n];
        for (int i = 0; i < n; i++) {
            listaAlunos[i] = entrada.readLine();
        }
        Arrays.sort(listaAlunos);

        // saida
        System.out.println(listaAlunos[k - 1]);
    }
}