import java.util.Scanner;
 
public class Ex3058 { //para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) { 
        // variaveis
        int n, gramas;
        Double preco, precoUmKg, menorPreco = 0.0;
        Scanner scanner = new Scanner(System.in);
        String entrada;
        String[] valores;

        // entrada
        n = scanner.nextInt();
        scanner.nextLine(); // limpando o buffer
        for (int i = 0; i < n; i++) {
            entrada = scanner.nextLine();
            valores = entrada.split("\\s");
            preco = Double.parseDouble(valores[0]);
            gramas = Integer.parseInt(valores[1]);

            // processamento
            precoUmKg = precoDeUmQuilo(preco, gramas);

            if (i == 0) {
                menorPreco = precoUmKg;
            } else {
                if (precoUmKg < menorPreco) {
                    menorPreco = precoUmKg;
                }
            }
        }

        // saida
        System.out.printf("%.2f\n", menorPreco);
        scanner.close();
    }

    static Double precoDeUmQuilo(Double preco, int gramas) {
        return (preco * 1000) / gramas;
    }
}