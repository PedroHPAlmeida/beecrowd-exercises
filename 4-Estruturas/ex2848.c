#include <stdio.h>
#include <stdlib.h>

int contNum(int vet[], int tamVet, int num);
void selection(int vet[], int tamVet);
void copiaVetor(int vetOrig[], int vetDest[], int tamVetDest, int limInf);
void leVetor(int vet[], int tamVet);

int main(){
    //variaveis
    int tamVet, rodadas;
    int limInf, limSup, kMenor, guga, dabriel;
    int *vet, *intervalo;
    int i;

    //entrada
    scanf("%d %d", &tamVet, &rodadas);
    vet = (int*) malloc(tamVet * sizeof(int));
    leVetor(vet, tamVet);
    
    for(i = 0; i < rodadas; i++){
        scanf("%d %d %d %d %d", &limInf, &limSup, &kMenor, &guga, &dabriel);

        //processamento
        int tamIntervalo = limSup - limInf + 1;
        intervalo = (int*) malloc(tamIntervalo * sizeof(int));
        copiaVetor(vet, intervalo, tamIntervalo, limInf - 1);

        selection(intervalo, tamIntervalo);
        int menor = intervalo[kMenor - 1];
        int contKEsimo = contNum(intervalo, tamIntervalo, menor);

        int difGuga = abs(contKEsimo - guga);
        int difDabri = abs(contKEsimo - dabriel);

        char result = 'E';
        if(difGuga < difDabri){result = 'G';}
        else if(difDabri < difGuga){result = 'D';}

        //saida
        printf("%d %d %c\n", menor, contKEsimo, result);
        free(intervalo);
    }

    free(vet);
    return 0;
}

int contNum(int vet[], int tamVet, int num){
    int i, cont = 0;
    for(i = 0; i < tamVet; i++){
        if(vet[i] == num){
            cont++;
        }
    }
    return cont;
}

void selection(int vet[], int tamVet){
    int i, j;
    for (i = 0; i < tamVet - 1; i++) {
        int min = i;
        for (j = i + 1; j < tamVet; j++) {
            if (vet[j] < vet[min]) {
                min = j;
            }
        }
        int aux = vet[i];
        vet[i] = vet[min];
        vet[min] = aux;
    }
}

void copiaVetor(int vetOrig[], int vetDest[], int tamVetDest, int limInf){
    int i, j;
    for(i = 0, j = limInf; i < tamVetDest; i++, j++){
        vetDest[i] = vetOrig[j];
    }
}

void leVetor(int vet[], int tamVet){
    int i;
    for(i = 0; i < tamVet; i++){
        scanf("%d", &vet[i]);
    }
}