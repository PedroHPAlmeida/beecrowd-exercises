import java.util.Scanner;

public class Ex2679 {// para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]) {
        // variaveis
        Scanner scanner = new Scanner(System.in);
        int n;

        // entrada
        n = scanner.nextInt();

        // processamento
        n += 1;
        if (n % 2 == 1) {
            n += 1;
        }

        // saida
        System.out.println(n);
        scanner.close();
    }
}