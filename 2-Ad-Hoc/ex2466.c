#include <stdio.h>
#include <stdlib.h>

void leVetor(int vet[], int tamVet);

int main(){
    //variaveis
    int i, linha, n;
    int* bolas;

    //entrada
    scanf("%d", &n);
    bolas = (int *) malloc(n * sizeof(int));
    leVetor(bolas, n);

    //processamento
    linha = n - 1;
    while(linha > 0){
        for(i = 0; i < linha; i++){
            bolas[i] = bolas[i] * bolas[i + 1];
        }
        linha--;
    }

    //saida
    if(bolas[0] == 1){
        printf("preta\n");
    }
    else{
        printf("branca\n");
    }
    free(bolas);
    return 0;
}

void leVetor(int vet[], int tamVet){
    int i;
    for(i = 0; i < tamVet; i++){
        scanf("%d", &vet[i]);
    }
}