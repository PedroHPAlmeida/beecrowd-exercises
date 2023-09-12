import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Ex1130 {
    static boolean jogada(StringBuffer tabuleiro) {
        if (tabuleiro.indexOf("XXX") != -1) {
            return true;
        } else if (tabuleiro.indexOf("...") == -1 && tabuleiro.indexOf("X.X") == -1 && tabuleiro.indexOf(".XX") == -1
                && tabuleiro.indexOf("XX.") == -1) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) throws IOException {
        /* variaveis */
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(in);
        String aux = new String();
        int n;
        char ePossivel;

        /* entrada */
        while (true) {
            n = entrada.read();
            if (n == '0') { // condicao de parada
                break;
            }

            ePossivel = 'N';
            StringBuffer tabuleiro = new StringBuffer(n), tabFuturo = new StringBuffer(n);

            entrada.readLine();
            aux = entrada.readLine();
            tabuleiro.append(aux);

            // processamento
            for (int i = 0; i < tabuleiro.length(); i++) {
                tabFuturo.delete(0, tabFuturo.length());
                tabFuturo.append(aux);
                if (tabuleiro.charAt(i) == '.') {
                    tabFuturo.setCharAt(i, 'X');
                    if (jogada(tabFuturo)) {
                        ePossivel = 'S';
                        break;
                    }
                }
            }
            // saida
            System.out.println(ePossivel);
        }

        entrada.close();
    }
}