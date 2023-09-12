import java.util.Scanner;

public class Ex3214 { //para ser aceito no URI mude o nome da classe para Main
    public static void main(String[] args) {
        // variaveis
        String[] valoresSeparados;
        int e, f, c, totalRefri = 0, totalGarrafasVazias;

        // entrada
        valoresSeparados = leitura();
        e = Integer.parseInt(valoresSeparados[0]);
        f = Integer.parseInt(valoresSeparados[1]);
        c = Integer.parseInt(valoresSeparados[2]);

        // processamento
        totalGarrafasVazias = e + f;
        while(totalGarrafasVazias >= c){
            int aux = totalGarrafasVazias / c;
            totalRefri += aux;
            totalGarrafasVazias = aux + (totalGarrafasVazias % c);
        }
        
        //saida
        System.out.println(totalRefri);
    }

    static String[] leitura() {
        Scanner scanner = new Scanner(System.in);
        String valores;

        valores = scanner.nextLine();
        scanner.close();
        return valores.split("\\s");
    }
}