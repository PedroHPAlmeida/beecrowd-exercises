import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1060 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada & processamento
        int contPositivos = 0;
        for (int i = 0; i < 6; i++) {
            if (Double.parseDouble(bf.readLine()) > 0d) {
                contPositivos++;
            }
        }
        bf.close();
        // saida
        System.out.printf("%d valores positivos\n", contPositivos);
    }
}
