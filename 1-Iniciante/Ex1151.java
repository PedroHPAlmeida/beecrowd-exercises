import java.util.Scanner;

public class Ex1151 {
    public static void main(String[] args) {
        // objetos & variaveis
        Scanner sc = new Scanner(System.in);

        // entrada
        int n = sc.nextInt();
        sc.close();

        // processamento
        int nMenosDois = 0;
        int nMenosUm = 1;
        int atual;
        String valores = nMenosDois + " " + nMenosUm;
        
        for(int i = 2; i < n; i++){
            atual = nMenosDois + nMenosUm;
            valores += " " + atual;
            nMenosDois = nMenosUm;
            nMenosUm = atual;
        }

        // saida
        System.out.printf("%s\n", valores);
    }
}