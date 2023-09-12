public class Ex1097{
    public static void main(String[] args) {
        // processamento & saida
        int i = 1, j = 7;
        int cont = 0;
        while(i < 10){
            System.out.printf("I=%d J=%d\n", i, j);

            j -= 1;
            cont++;
            if(cont == 3){
                i += 2;
                j += 5;
                cont = 0;
            }
        }
    }
}