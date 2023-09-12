import java.util.Scanner;

public class Ex2377 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);
        int compriEstrada, distPedagio;
        int custoPorKm, valorPedagio;
        int custTotal = 0;

        // entrada
        compriEstrada = scanner.nextInt();
        distPedagio = scanner.nextInt();
        custoPorKm = scanner.nextInt();
        valorPedagio = scanner.nextInt();

        // processamento
        custTotal = custoPorKm * compriEstrada;
        custTotal += (compriEstrada / distPedagio) * valorPedagio;

        // saida
        System.out.println(custTotal);

        scanner.close();
    }
}