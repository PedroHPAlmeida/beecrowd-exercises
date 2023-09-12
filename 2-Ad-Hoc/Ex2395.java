import java.util.Scanner;

public class Ex2395 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis e objetos
        Scanner scanner = new Scanner(System.in);
        int largCont, compCont, altCont;
        int largNav, compNav, altNav;
        int qntdConteiners;

        // entrada
        largCont = scanner.nextInt();
        compCont = scanner.nextInt();
        altCont = scanner.nextInt();
        largNav = scanner.nextInt();
        compNav = scanner.nextInt();
        altNav = scanner.nextInt();

        // processamento
        qntdConteiners = (largNav / largCont) * (compNav / compCont) * (altNav / altCont);

        // saida
        System.out.println(qntdConteiners);
        scanner.close();
    }
}