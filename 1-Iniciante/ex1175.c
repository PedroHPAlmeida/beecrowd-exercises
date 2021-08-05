#include <stdio.h>

#define TAM 20

int main(){
    /*variaveis*/
    int n[TAM], i, j, aux;

    /*entrada*/
    for(i = 0; i < TAM; i++){
        scanf("%d", &n[i]);
    }

    /*processamento*/
    for(i = 0, j = (TAM - 1); i < (TAM / 2), j > (TAM / 2) - 1; i++, j--){
        aux = n[i];
        n[i] = n[j];
        n[j] = aux;
    }

    /*saida*/
    for(i = 0; i < TAM; i++){
        printf("N[%d] = %d\n", i, n[i]);
    }
    return 0;
}