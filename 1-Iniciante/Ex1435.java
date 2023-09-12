import java.util.Scanner;

public class Ex1435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int temp = n;
            if(n == 0) break; // condicao de parada
            
            int[][] mat = new int[n][n];

            if(n < 3){
                preencheMat(mat, 0, n - 1, 1);
            }
            else{
                int ini = 0;
                int fim = n - 1;
                int val = 1;

                while(n >= 2){
                    preencheMat(mat, ini, fim, val);
                    ini++;
                    fim--;
                    val++;
                    n--;
                }
            }
            printMat(mat, temp);
        }

    }

    public static void preencheMat(int[][] mat, int inicio, int fim, int valor){
        for(int i = inicio; i <= fim; i++){
            for(int j = inicio; j <= fim; j++){
                mat[i][j] = valor;
            }
        }
    }
    
    public static void printMat(int[][] mat, int ord){
        for(int i = 0; i < ord; i++){
            for(int j = 0; j < ord; j++){
                if(j == 0) System.out.printf("%3d", mat[i][j]);
                else System.out.printf("%4d", mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}