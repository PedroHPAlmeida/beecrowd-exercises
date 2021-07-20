#include <stdio.h>
#define TAM 100

void leitura(int *vet);
void maior(int *vet); 

int main(){
    /*variaveis*/
    int numeros[TAM];

    /*entrada*/
    leitura(numeros);

    /*processamento & saída*/
    maior(numeros);

    return 0;
}

void leitura(int *vet){
    /*variaveis*/
    int i;

    /*entrada*/
    for(i = 0; i < TAM; i++){
        scanf("%d", &vet[i]);
    }
}

void maior(int *vet){
    /*variaveis*/
    int i = 0;
    int maior;
    int pos;

    /*processamento*/
    maior = vet[i];
    for(i = 1; i < TAM; i++){
        if(vet[i] > maior){
            maior = vet[i];
            pos = i;
        }
    }

    /*saida*/
    printf("%d\n", maior);
    printf("%d\n", pos + 1);
}