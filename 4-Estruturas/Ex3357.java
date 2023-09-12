import java.util.Scanner;

public class Ex3357 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis e objetos
        Scanner scanner = new Scanner(System.in);

        // entrada
        int n = scanner.nextInt();
        double lGarrafa = scanner.nextDouble();
        double lCuia = scanner.nextDouble();
        scanner.nextLine();
        String entrada = scanner.nextLine();
        String[] nomes = entrada.split("\\s");

        // processamento
        double aux = lGarrafa;
        int cont = -1;
        while (true) {
            cont++;
            if (aux - lCuia <= 0) {
                break;
            } else {
                aux = Math.round((aux - lCuia) * 10.0) / 10.0;
            }
        }

        String nome = nomes[cont % n];

        // saida
        System.out.printf("%s %.1f\n", nome, aux);
        scanner.close();
    }
}