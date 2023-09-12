import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex1038 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] input = bf.readLine().split(" ");
        int codProduto = Integer.parseInt(input[0]);
        int qntProduto = Integer.parseInt(input[1]);
        double valorPagar = 0;

        // processamento
        switch (codProduto) {
            case 1:
                valorPagar = qntProduto * 4.0;
                break;
            case 2:
                valorPagar = qntProduto * 4.5;
                break;
            case 3:
                valorPagar = qntProduto * 5.0;
                break;
            case 4:
                valorPagar = qntProduto * 2.0;
                break;
            case 5:
                valorPagar = qntProduto * 1.5;
                break;
        }

        // saida
        System.out.printf("Total: R$ %.2f\n", valorPagar);
        System.out.close();
    }
}
