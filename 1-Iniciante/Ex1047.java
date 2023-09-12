import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1047 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] input = bf.readLine().split(" ");
        bf.close();

        int hrInicio = Integer.parseInt(input[0]);
        int minInicio = Integer.parseInt(input[1]);
        int hrFim = Integer.parseInt(input[2]);
        int minFim = Integer.parseInt(input[3]);

        // processamento
        int tempoEmMinutosInicio = hrInicio * 60 + minInicio; // calcula o tempo em minutos no momento de inicio do jogo
        int tempoEmMinutosFim = hrFim * 60 + minFim; // calcula o tempo em minutos no momento em que o jogo eh encerrado

        int duracao = tempoEmMinutosInicio < tempoEmMinutosFim ? (tempoEmMinutosFim - tempoEmMinutosInicio) : (24 * 60 - tempoEmMinutosInicio) + tempoEmMinutosFim; // se o tempoEmMinutosInicio for < tempoEmMinutosFim, entao eh feita uma diferenca simples. Caso contrario, significa que o jogo acabou apenas no dia seguinte, entao eh feito um calculo mais elaborado 

        // saida
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", duracao / 60, duracao % 60);
    }
}