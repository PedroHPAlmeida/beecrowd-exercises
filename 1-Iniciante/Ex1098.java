public class Ex1098 {
    public static void main(String[] args) {
        // processamento & saida
        float i = 0f, j = 1f;
        int cont = 0;

        while(i < 2.1){
            print(i, j);

            j += 1;
            cont++;
            if(cont == 3){
                i += 0.2d;
                j -= 2.8d;
                cont = 0;
            }
        }
    }

    public static void print(float i, float j){
        int partInt = (int)i;
        float aux = i - partInt;

        if(aux >= 0.2) System.out.printf("I=%.1f J=%.1f\n", i, j);
        else System.out.printf("I=%.0f J=%.0f\n", i, j);
    }
}
