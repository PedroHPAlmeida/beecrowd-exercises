import java.util.Scanner;

public class Ex3303 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        palavra = scanner.nextLine();

        if (palavra.length() > 9) {
            System.out.println("palavrao");
        } else {
            System.out.println("palavrinha");
        }
        scanner.close();
    }
}