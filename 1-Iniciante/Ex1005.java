import java.util.Scanner;

public class Ex1005 { //para ser aceito no URI, mude o nome da classe para Main
   public static void main(String args[]){
        //variaveis
        Double a, b, peso1 = 3.5, peso2= 7.5, media;
        Scanner entrada = new Scanner(System.in);

        //entrada
        a = entrada.nextDouble();
        b = entrada.nextDouble();

        //processamento
        media = (a * peso1 + b * peso2) / (peso1 + peso2);

        //saida
        System.out.printf("MEDIA = %.5f\n", media);
        entrada.close();
   } 
}