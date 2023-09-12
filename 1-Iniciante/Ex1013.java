import java.util.Scanner;

public class Ex1013 { //para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);

        // entrada
        String[] valores = scanner.nextLine().split(" ");
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);

        // processamento
        int maiorAB = maior(a, b);
        int maiorABC = maior(maiorAB, c);

        // saida
        System.out.println(maiorABC + " eh o maior");
        scanner.close();
    }

    public static int maior(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }
}
