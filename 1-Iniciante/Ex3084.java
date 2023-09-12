import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3084 { // para ser aceito no URI, mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis e objetos
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int hhAng, mmAng, hh, mm;

        // entrada
        while (true) {
            String linha = bf.readLine();

            if (linha == null || linha == "") { // condicao de parada
                break;
            }

            String[] input = linha.split(" ");
            hhAng = Integer.parseInt(input[0]);
            mmAng = Integer.parseInt(input[1]);

            // processamento
            hh = hhAng / 30;
            mm = mmAng / 6;

            // saida
            System.out.printf("%02d:%02d\n", hh, mm);
        }
    }
}
