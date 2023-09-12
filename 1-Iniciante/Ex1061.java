import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1061 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] linhaDia = bf.readLine().split(" ");
        int diaInicio = Integer.parseInt(linhaDia[1]);

        String[] linhaHorario = bf.readLine().split(" : ");
        int hrInicio = Integer.parseInt(linhaHorario[0]);
        int minInicio = Integer.parseInt(linhaHorario[1]);
        int segInicio = Integer.parseInt(linhaHorario[2]);

        linhaDia = bf.readLine().split(" ");
        int diaFim = Integer.parseInt(linhaDia[1]);

        linhaHorario = bf.readLine().split(" : ");
        int hrFim = Integer.parseInt(linhaHorario[0]);
        int minFim = Integer.parseInt(linhaHorario[1]);
        int segFim = Integer.parseInt(linhaHorario[2]);
        bf.close();

        // processamento
        int momentoInicio = (diaInicio * 86400) + (hrInicio * 3600) + (minInicio * 60) + segInicio;
        int momentoFim = (diaFim * 86400) + (hrFim * 3600) + (minFim * 60) + segFim;

        int aux = momentoFim - momentoInicio;
        int dias = aux / 86400; // calculo de dias
        aux -= (dias * 86400);

        int horas = aux / 3600; // calculo de horas
        aux -= (horas * 3600);

        int minutos = aux / 60; // calculo de minutos
        aux -= (minutos * 60);

        int segundos = aux;

        // saida
        System.out.printf("%d dia(s)\n", dias);
        System.out.printf("%d hora(s)\n", horas);
        System.out.printf("%d minuto(s)\n", minutos);
        System.out.printf("%d segundo(s)\n", segundos);
    }
}