import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1272 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        int n = Integer.parseInt(bf.readLine());
        while (n > 0) {
            n--;
            String[] frase = bf.readLine().split(" ");

            // processamento
            String msgOculta = "";
            for (String palavra : frase) {
                msgOculta = !palavra.equals("") ? msgOculta + palavra.charAt(0) : msgOculta + "";
            }

            // saida
            System.out.printf("%s\n", msgOculta);
        }
        bf.close();
    }
}
