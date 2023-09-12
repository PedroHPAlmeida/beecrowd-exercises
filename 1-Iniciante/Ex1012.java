import java.util.Scanner;

public class Ex1012 { //para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scanner = new Scanner(System.in);
        
        // entrada
        String[] valores = scanner.nextLine().split(" ");
        Double a = Double.parseDouble(valores[0]);
        Double b = Double.parseDouble(valores[1]);
        Double c = Double.parseDouble(valores[2]);

        // processamento & saida
        Double area = a * c / 2;
        System.out.printf("TRIANGULO: %.3f\n", area);
        
        area = 3.14159 * Math.pow(c, 2);
        System.out.printf("CIRCULO: %.3f\n", area);

        area = ((a + b) * c) / 2;
        System.out.printf("TRAPEZIO: %.3f\n", area);

        area = b * b;
        System.out.printf("QUADRADO: %.3f\n", area);

        area = a * b;
        System.out.printf("RETANGULO: %.3f\n", area);

        scanner.close();
    }
}
