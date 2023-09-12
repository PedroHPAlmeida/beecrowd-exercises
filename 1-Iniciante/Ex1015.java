import java.util.Scanner;

public class Ex1015 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);

        // entrada
        String[] valores = scanner.nextLine().split(" ");
        double x1 = Double.parseDouble(valores[0]);
        double y1 = Double.parseDouble(valores[1]);
        
        valores = scanner.nextLine().split(" ");
        double x2 = Double.parseDouble(valores[0]);
        double y2 = Double.parseDouble(valores[1]);

        // processamento
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        //saida
        System.out.printf("%.4f\n", distancia);
        scanner.close();
    }
}
