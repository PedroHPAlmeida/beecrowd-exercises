import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex1062{
    public static void main(String[] args) throws IOException {
        // variaveis & objetos
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // entrada
        int numVagoes;
        while(true) {
            numVagoes = Integer.parseInt(bf.readLine());
            if(numVagoes == 0) break; // condicao de parada

            while(true){
                String input = bf.readLine();
                if(input.equals("0")) break; // condicao de parada da leitura de trems

                // processamento
                String ehPossivel = "Yes";
                Stack<Integer> vagoesA = conversao(input.split(" "));
                Stack<Integer> estacao = new Stack<>();
                Stack<Integer> vagoesB = new Stack<>();

                int prox = numVagoes - vagoesB.size();
                while (prox != 0){
                    if(!estacao.isEmpty() && estacao.peek().equals(prox)) vagoesB.push(estacao.pop());
                    else if(!vagoesA.isEmpty() && vagoesA.peek().equals(prox)) vagoesB.push(vagoesA.pop());
                    else {
                        if(vagoesA.isEmpty()){
                            ehPossivel = "No";
                            break;
                        }
                        estacao.push(vagoesA.pop());
                    }
                    prox = numVagoes - vagoesB.size();
                }

                // saida
                System.out.printf("%s\n", ehPossivel);
            }
            System.out.print("\n");
        }
        bf.close();
    }
    public static Stack<Integer> conversao(String[] input){
        Stack<Integer> stack = new Stack<>();
        for(String s : input){
            stack.push(Integer.parseInt(s));
        }
        return stack;
    }
}
