import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1071 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        br.close();

        // processamento
        if(x > y){
            int aux = x;
            x = y;
            y = aux;
        }
        
        int soma = 0;
        for (int i = x + 1; i < y; i++) {
            if (Math.abs(i % 2) == 1) soma += i;
        }

        // saida
        System.out.printf("%d\n", soma);
    }
}