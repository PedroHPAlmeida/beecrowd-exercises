public class Ex1156 { // Alterar o nome da classe para Main para funcionar no beecrowd
    public static void main(String[] args) {
      // processamento
      double s = 0;
      for(int i = 1, j = 1; i < 40; i +=2, j *= 2) { 
          s += (double)i/j;
      }
      // saída
      System.out.printf("%.2f\n", s);
    }
}