import java.util.Scanner;

public class Ex1010 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]) {
        /* variaveis */
        Scanner scanner = new Scanner(System.in);
        int[] codPecas = new int[2], nPecas = new int[2];
        Double[] valorPecas = new Double[2];
        String entrada = new String();
        Double totalPagar;

        /* entrada */
        entrada = scanner.nextLine();
        String[] valores = entrada.split("\\s");
        codPecas[0] = Integer.parseInt(valores[0]);
        nPecas[0] = Integer.parseInt(valores[1]);
        valorPecas[0] = Double.parseDouble(valores[2]);

        entrada = scanner.nextLine();
        valores = entrada.split("\\s");
        codPecas[1] = Integer.parseInt(valores[0]);
        nPecas[1] = Integer.parseInt(valores[1]);
        valorPecas[1] = Double.parseDouble(valores[2]);

        /* processamento */
        totalPagar = nPecas[0] * valorPecas[0] + nPecas[1] * valorPecas[1];

        /* saida */
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);

        scanner.close();
    }
}