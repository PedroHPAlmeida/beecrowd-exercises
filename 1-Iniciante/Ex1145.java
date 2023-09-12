import java.util.Scanner;

public class Ex1145 { // ALterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // objetos
        Scanner sc = new Scanner(System.in);

        // variáveis & entrada
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int valor = 1;
        int cont = 1;

        // processamento & saída
        while (valor <= y) {
            if (cont < x) {
                System.out.prinf("%d ", valor);
                cont++;
            } else {
                System.out.printf("%d\n", valor);
                cont = 1;
            }
            valor++;
        }
    }
}