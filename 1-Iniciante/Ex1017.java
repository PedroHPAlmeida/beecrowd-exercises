import java.util.Scanner;

public class Ex1017 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);

        // entrada
        int tempoGastoHoras = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt(); 

        // processamento & saida        
        System.out.printf("%.3f\n", (float)(tempoGastoHoras * velocidadeMedia) / 12);
        scanner.close();
    }
}
