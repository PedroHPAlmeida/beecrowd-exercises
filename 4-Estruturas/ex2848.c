#include <stdio.h>
#include <stdlib.h>

void copiaIntervalo(int vetDest[], int vetOrig[], int limInf, int limSup);
void insertion(int n, int vet[]);
void leVetor(int vet[], int tamVet);

int main(){
    //variaveis
    int tamVet, rodadas;
    int limInf, limSup, kMenor, guga, dabriel;
    int menor;

    //entrada
    scanf("%d %d", &tamVet, &rodadas);
    int *vet = (int*) malloc(tamVet * sizeof(int));
    leVetor(vet, tamVet);

    for(int i = 0; i < rodadas; i++){
        scanf("%d %d %d %d %d", &limInf, &limSup, &kMenor, &guga, &dabriel);

        //processamento
        int *intervalo = (int*) malloc((limSup - limInf) * sizeof(int));
        copiaIntervalo(intervalo, vet, limInf, limSup);
        insertion(limSup - limInf, intervalo);
        menor = intervalo[i];

        for(i = 0; i < limSup - limInf; i++){
            printf("%d ", intervalo[i]);
        }
    }

    //saida


    return 0;
}

void copiaIntervalo(int vetDest[], int vetOrig[], int limInf, int limSup){
    int i, j;
    for(i = limInf, j = 0; i <= limSup; i++, j++){
        vetDest[j] = vetOrig[i];
    }   
}

void insertion(int n, int vet[]) {
    for (int i = 1; i < n; i++) {
        int x = vet[i];
        int j;
        for (j = i - 1; j >= 0 && vet[j] > x; j--) {
            vet[j + 1] = vet[j];
        }
        vet[j + 1] = x;
    }
}

void leVetor(int vet[], int tamVet){
    int i, j;
    char *entrada = (char*) malloc(tamVet + (tamVet - 1) + 1);

    fflush(stdin);
    scanf("%[^\n]s", entrada);

    for(i = 0, j = 0; i < tamVet + 1; i++, j += 2){
        vet[i] = entrada[j] - '0';
    }
    free(entrada);
}