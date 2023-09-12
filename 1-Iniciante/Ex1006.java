import java.util.Scanner;

public class Ex1006 { //para ser aceito no URI, mude o nome da classe para Main
    public static void main(String args[]){
        //variaveis
        Double a, b, c, media;
        Double peso1 = 2.0, peso2 = 3.0, peso3 = 5.0;
        Scanner entrada = new Scanner(System.in);

        //entrada
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        //processamento
        media = (a * peso1 + b * peso2 + c * peso3) / (peso1 + peso2 + peso3);

        //saida
        System.out.printf("MEDIA = %.1f\n", media);
        entrada.close();
    }
}