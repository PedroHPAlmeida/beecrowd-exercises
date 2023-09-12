import java.util.Scanner;

public class Ex1007 { //para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]) {
        /* variaveis */
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, resultado;

        /* entrada */
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        /* processamento */
        resultado = a * b - c * d;

        /* saida */
        System.out.println("DIFERENCA = " + resultado);
        scanner.close();
    }
}