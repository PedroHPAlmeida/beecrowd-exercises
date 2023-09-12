import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1052 { // para ser aceito no Beecrowd mude o nome da classe para Main
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        int numMes = bf.read();
        bf.close();
        String mesExtenso = "";

        // processamento
        switch (numMes) {
            case 1 -> mesExtenso = "January";
            case 2 -> mesExtenso = "February";
            case 3 -> mesExtenso = "March";
            case 4 -> mesExtenso = "April";
            case 5 -> mesExtenso = "May";
            case 6 -> mesExtenso = "June";
            case 7 -> mesExtenso = "July";
            case 8 -> mesExtenso = "August";
            case 9 -> mesExtenso = "September";
            case 10 -> mesExtenso = "October";
            case 11 -> mesExtenso = "November";
            case 12 -> mesExtenso = "December";
        }

        // saida
        System.out.printf("%s\n", mesExtenso);
    }
}