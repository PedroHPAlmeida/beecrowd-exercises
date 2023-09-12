import java.util.Scanner;

public class Ex1016 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);

        // entrada
        int distancia = scanner.nextInt();

        // processamento & saida
        System.out.println(distancia * 2 + " minutos");
        scanner.close();
    }
}
