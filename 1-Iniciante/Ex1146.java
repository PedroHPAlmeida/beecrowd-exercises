import java.util.Scanner;

public class Ex1146 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // Objeto
        Scanner sc = new Scanner(System.in);

        // Processamento & Saída
        while(true) {
            int entrada = sc.nextInt();
            if(entrada == 0) break;
            String valores = "1";
            for(int i = 2; i <= entrada; i++){
                valores += " " + i;
            }
            System.out.printf("%s\n", valores);
        }
        sc.close();
    }     
}