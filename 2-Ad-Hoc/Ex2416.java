import java.util.Scanner;

public class Ex2416 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis e objetos
        Scanner scanner = new Scanner(System.in);
        int metros, tamPista, pontoParada;

        // entrada
        metros = scanner.nextInt();
        tamPista = scanner.nextInt();

        // processamento
        pontoParada = metros;
        if (metros >= tamPista) {
            pontoParada = metros % tamPista;
        }

        // saida
        System.out.println(pontoParada);
        scanner.close();
    }
}