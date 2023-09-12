import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1118{ // para ser aceito no Beecrowd mude o nome da classe para Main

    public static void main(String[] args) throws IOException{
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        int resp;
        do {
            double nota1 = validaNota(bf); // validacao
            double nota2 = validaNota(bf);

            // processamento
            double media = (nota1 + nota2) / 2;

            // saida
            System.out.printf("media = %.2f\n", media);

            resp = 0;
            while (resp < 1 || resp > 2){ // validacao resposta
                System.out.print("novo calculo (1-sim 2-nao)\n");
                resp = Integer.parseInt(bf.readLine()); // pergunta ao usuario se ele deseja continuar
            }
        } while (resp != 2);
    }

    public static double validaNota(BufferedReader bf) throws IOException{
        double nota;
        while (true){ // validacao
            nota = Double.parseDouble(bf.readLine());

            if(nota >= 0d && nota <= 10d){
                break;
            }
            System.out.print("nota invalida\n");
        }
        return nota;
    }
}
