import java.util.Scanner;
public class Ex1001 { //para ser aceito no URI, mude o nome da classe para Main
    public static void main(String[] args){
        //variaveis
        int a, b, x;
        Scanner entrada = new Scanner(System.in);       
    
        //entrada
        a = entrada.nextInt();
        b = entrada.nextInt();
        
        //processamento
        x = a + b;

        //saida
        System.out.println("X = " + x);
        entrada.close();
    }
}