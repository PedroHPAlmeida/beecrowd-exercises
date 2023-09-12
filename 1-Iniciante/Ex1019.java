import java.util.Scanner;

public class Ex1019 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis & objetos
        Scanner scan = new Scanner(System.in);
        int ss, hh, mm;

        // entrada
        ss = scan.nextInt();

        // processamento
        int aux = ss / 3600;
        hh = aux;
        ss -= (hh * 3600);
        aux = ss / 60;
        mm = aux;
        ss -= (mm * 60);

        // saida
        System.out.println(hh + ":" + mm + ":" + ss);

        scan.close();
    }
}