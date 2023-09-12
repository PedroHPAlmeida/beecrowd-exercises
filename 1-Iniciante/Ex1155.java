public class Ex1155 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
        // processamento
        double s = 0;
        for(int i = 1; i < 101; i++) { 
            s +=  1.0/i;
        }
        // saída
        System.out.printf("%.2f\n", s);
    }
}