import java.util.Scanner;

public class Ex1003 { //para ser aceito no URI, mude o nome da classe para Main
    public static void main(String args[]){
        //variaveis
        int a, b, soma;
        Scanner entrada = new Scanner(System.in);
    
        //entrada
        a = entrada.nextInt();
        b = entrada.nextInt();

        //processamento
        soma = a + b;

        //saida
        System.out.printf("SOMA = %d\n", soma);
        entrada.close();
    }
}