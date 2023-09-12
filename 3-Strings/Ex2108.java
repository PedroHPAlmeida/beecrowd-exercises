import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2108 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String maiorPalavra = "";
        int maior = 0;

        // entrada
        while (true) {
            String[] frase = bf.readLine().split(" ");
            if (frase[0].equals("0"))
                break; // condicao de parada

            // processamento & saida
            int numLetras;
            int tam = frase.length;

            for (int i = 0; i < tam; i++) {
                numLetras = frase[i].length();

                if (numLetras >= maior) { // verifica a maior palavra digitada
                    maior = numLetras;
                    maiorPalavra = frase[i];
                }

                if (i < tam - 1) {
                    System.out.printf("%d-", numLetras);
                } else {
                    System.out.printf("%d\n", numLetras);
                }
            }
        }
        bf.close();
        System.out.printf("\nThe biggest word: %s\n", maiorPalavra);
    }
}