import java.util.Scanner;
public class Ex1958{
    public static void main(String[] args) {
        // entrada
        Scanner sc = new Scanner(System.in);
        Double entrada = sc.nextDouble();
        sc.close();

        // saida
        System.out.printf("%+.4E\n", entrada);
    }
}