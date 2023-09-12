import java.util.Scanner;

public class Ex2848 { // para ser aceito no URI mude o nome da classe para Main
    public static void main(String args[]) {
        // variaveis e objetos
        Scanner scan = new Scanner(System.in);
        int tamVet, rodadas;
        int limInf, limSup, kMenor, guga, dabriel;

        // entrada
        tamVet = scan.nextInt();
        rodadas = scan.nextInt();

        int vet[] = new int[tamVet];
        for (int i = 0; i < tamVet; i++) {
            vet[i] = scan.nextInt();
        }

        for (int i = 0; i < rodadas; i++) {
            limInf = scan.nextInt();
            limSup = scan.nextInt();
            kMenor = scan.nextInt();
            guga = scan.nextInt();
            dabriel = scan.nextInt();

            // processamento
            int tamIntervalo = limSup - limInf + 1;
            int intervalo[] = new int[tamIntervalo];
            copiaVetor(vet, intervalo, tamIntervalo, limInf - 1);

            selection(intervalo, tamIntervalo);
            int menor = intervalo[kMenor - 1];
            int contKEsimo = contNum(intervalo, tamIntervalo, menor);

            int difGuga = Math.abs(contKEsimo - guga);
            int difDabri = Math.abs(contKEsimo - dabriel);

            char result = 'E';
            if (difGuga < difDabri) {
                result = 'G';
            } else if (difDabri < difGuga) {
                result = 'D';
            }

            // saida
            System.out.printf("%d %d %c\n", menor, contKEsimo, result);
        }
        scan.close();
    }

    static int contNum(int vet[], int tamVet, int num) {
        int cont = 0;
        for (int i = 0; i < tamVet; i++) {
            if (vet[i] == num) {
                cont++;
            }
        }
        return cont;
    }

    static void selection(int vet[], int tamVet) {
        for (int i = 0; i < tamVet - 1; i++) {
            int min = i;
            for (int j = i + 1; j < tamVet; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                }
            }
            int aux = vet[i];
            vet[i] = vet[min];
            vet[min] = aux;
        }
    }

    static void copiaVetor(int vetOrig[], int vetDest[], int tamVetDest, int limInf) {
        for (int i = 0, j = limInf; i < tamVetDest; i++, j++) {
            vetDest[i] = vetOrig[j];
        }
    }
}