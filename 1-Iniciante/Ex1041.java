import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1041 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variavies & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] input = bf.readLine().split(" ");
        float x = Float.parseFloat(input[0]);
        float y = Float.parseFloat(input[1]);
        bf.close();

        // processamento & saida
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0) {
            if (y > 0.0) {
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        } else if (x < 0.0) {
            if (y > 0.0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }
        }
    }
}
