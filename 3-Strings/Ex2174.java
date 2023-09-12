    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.HashSet;
    import java.util.Set;

    public class Ex2174 { // para ser aceito no Beecrowd mude o nome da classe para Main
        public static void main(String[] args) throws IOException {
            // variaveis & objetos
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            final int TOTAL_POKEMONS = 151;

            // entrada
            int n = Integer.parseInt(bf.readLine());
            Set<String> pokemons = new HashSet<>();
            while (n > 0) {
                n--;
                String nomePokemon = bf.readLine();
                pokemons.add(nomePokemon);
            }

            // processamento & saida
            System.out.printf("Falta(m) %d pomekon(s).\n", (TOTAL_POKEMONS - pokemons.size()));
            bf.close();
        }
    }