import java.util.Scanner;

public class Ex1004{ //para ser aceito no URI, mude o nome da classe para Main
    public static void main(String args[]){
        //variaveis
        int a, b, prod;
        Scanner entrada = new Scanner(System.in);
        
        //entrada
        a = entrada.nextInt();
        b = entrada.nextInt();

        //processamento
        prod = a * b;

        //saida
        System.out.println("PROD = " + prod);
        entrada.close();
    }
} 