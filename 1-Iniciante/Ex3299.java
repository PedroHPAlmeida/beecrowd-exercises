import java.util.Scanner;

public class Ex3299{ //para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]){
        /*variaveis*/
        Scanner entrada = new Scanner(System.in);
        String numero = "", msg = " NO es de Mala Suerte";

        /*entrada*/
        numero = entrada.nextLine();

        /*processamento*/
        for(int i = 0; i < numero.length(); i++){
            char c = numero.charAt(i);
            if(c == '1' && i < numero.length() - 1){
                c = numero.charAt(i + 1);
                if(c == '3'){
                    msg = " es de Mala Suerte";
                    break;
                }
            }
        }

        /*saida*/
        System.out.println(numero + msg);
        entrada.close();
    }
}