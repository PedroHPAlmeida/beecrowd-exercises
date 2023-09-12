import java.util.Scanner;

public class Ex1009 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]) {
        /* variaveis */
        Scanner scanner = new Scanner(System.in);
        String nome = new String();
        Double salarioFixo, totalVendas, salarioFinal;

        /* entrada */
        nome = scanner.nextLine();
        salarioFixo = scanner.nextDouble();
        totalVendas = scanner.nextDouble();

        /* processamento */
        salarioFinal = salarioFixo + totalVendas * 0.15;

        /* saida */
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

        scanner.close();
    }
}