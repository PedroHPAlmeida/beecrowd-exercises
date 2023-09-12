import java.util.Scanner;

public class Ex1943 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]) {
        /* variaveis */
        Scanner scanner = new Scanner(System.in);
        int n, tops[] = { 1, 3, 5, 10, 25, 50, 100 };

        /* entrada */
        n = scanner.nextInt();

        /* processamento & saida */
        for (int i = 0; i < tops.length; i++) {
            if (n <= tops[i]) {
                System.out.println("Top " + tops[i]);
                break;
            }
        }

        scanner.close();
    }
}