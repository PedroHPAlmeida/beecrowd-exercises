#include <stdio.h>
#include <stdlib.h> 

void insertion(int n, int vet[]);
void exibeVet(int vet[], int n);
void copiaVet(int vet1[], int vet2[], int n);

int main(){
    //variaveis
    int *vet = malloc(3 * sizeof(int));
    int *vetOrdenado = malloc(3 * sizeof(int));

    //entrada
    scanf("%d %d %d", &vetOrdenado[0], &vetOrdenado[1], &vetOrdenado[2]);

    //processamento
    copiaVet(vetOrdenado, vet, 3);
    insertion(3, vetOrdenado);

    //saida
    exibeVet(vetOrdenado, 3);
    printf("\n");
    exibeVet(vet, 3);

    return 0;
}

void copiaVet(int vet1[], int vet2[], int n){
    int i;
    for(i = 0; i < n; i++){
        vet2[i] = vet1[i];
    }
}

void exibeVet(int vet[], int n){
    int i;
    for(i = 0; i < 3; i++){
        printf("%d\n", vet[i]);
    }
}

void insertion(int n, int vet[]){
    int i, j;
    int aux;
    for(i = 0; i < n; i++){
        aux = vet[i];
        for(j = i - 1; j >= 0 && vet[j] > aux; j--){
            vet[j + 1] = vet[j];
        }
        vet[j + 1] = aux;
    }
}