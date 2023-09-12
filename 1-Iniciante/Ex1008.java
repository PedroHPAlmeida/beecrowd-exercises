import java.util.Scanner;

public class Ex1008 { //para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]) {
        /* variavies */
        Scanner scanner = new Scanner(System.in);
        int n, horasTrabalhadas;
        Double valorHoraTrab, salario;

        /* entrada */
        n = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        valorHoraTrab = scanner.nextDouble();

        /* processamento */
        salario = valorHoraTrab * horasTrabalhadas;

        /*saida */
        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        scanner.close();
    }
}