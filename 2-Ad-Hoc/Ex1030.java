import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Ex1030 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        short n = Short.parseShort(bf.readLine());
        short cont = 1;
        while (cont <= n) {
            String[] input = bf.readLine().split(" ");
            short nPessoas = Short.parseShort(input[0]);
            short salto = Short.parseShort(input[1]);

            // processamento
            List<Short> pessoas = preencheLista(nPessoas);
            short posicao = (short) ((salto - 1) % pessoas.size());
            while (pessoas.size() > 1) {
                pessoas.remove(posicao);
                posicao = (short) ((posicao + salto - 1) % pessoas.size());
            }

            // saida
            System.out.printf("Case %d: %d\n", cont, pessoas.remove(0));
            cont++;
        }
        bf.close();
    }

    public static List<Short> preencheLista(int nPessoas) {
        List<Short> lista = new LinkedList<>();

        for (short i = 1; i <= nPessoas; i++) {
            lista.add(i);
        }
        return lista;
    }
}