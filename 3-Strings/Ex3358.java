import java.util.Scanner;

public class Ex3358 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis e metodos
        Scanner scanner = new Scanner(System.in);
        String sobrenome, vogais = "AEIOU";
        int n;

        // entrada
        n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            sobrenome = scanner.nextLine();
            String aux = sobrenome.toUpperCase();
            int cont = 0;
            // processamento
            for (int j = 0; j < aux.length(); j++) {
                for (int k = 0; k < 5; k++) {
                    char a = aux.charAt(j);
                    char b = vogais.charAt(k);
                    if (a == b) {
                        cont = 0;
                        break;
                    }
                    cont++;
                    if (cont == 15) {
                        break;
                    }
                }
                if (cont == 15) {
                    break;
                }
            }

            // saida
            if (cont == 15) {
                System.out.println(sobrenome + " nao eh facil");
            } else {
                System.out.println(sobrenome + " eh facil");
            }
        }
        scanner.close();
    }
}