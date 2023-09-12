import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1046 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        String[] input = bf.readLine().split(" ");
        bf.close();
        byte hrInicio = Byte.parseByte(input[0]);
        byte hrFim = Byte.parseByte(input[1]);

        // processamento
        byte duracao = (byte) (hrInicio < hrFim ? hrFim - hrInicio : (24 - hrInicio) + hrFim);

        // saida
        System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
    }
}
