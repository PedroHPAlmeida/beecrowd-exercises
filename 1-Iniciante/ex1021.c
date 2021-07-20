#include <stdio.h>

void partInt(int vet[], int x);
void partDec(int vet[], int x);
void imprime(int vetCed[], int vetMoe[]);

int main(){
    /*variaveis*/
    int i, inteira, decimal, cedulas[7] = {0,0,0,0,0,0,0}; 
    int moedas[5] = {0,0,0,0,0};
    double valor;

    /*entrada*/
    scanf("%lf", &valor);

    /*processamento*/
    inteira = (int)(valor);
    decimal = (valor - inteira) * 100;

    partInt(cedulas, inteira);
    partDec(moedas, decimal);

    /*saida*/
    imprime(cedulas, moedas);
    return 0;
}

void partInt(int vet[], int x){
    int i = 0, aux, cedulas[7] = {100, 50, 20, 10, 5, 2, 1};
    while(x > 0){
        if(x >= cedulas[i]){
            vet[i] = x / cedulas[i]; 
            aux = x % cedulas[i];
            x = aux; 
        }
        i++;
    }
}

void partDec(int vet[], int x){
    int i = 0, aux, moedas[5] = {50, 25, 10, 5, 1};
    while(x > 0){
        if(x >= moedas[i]){
            vet[i] = x / moedas[i]; 
            aux = x % moedas[i];
            x = aux; 
        }
        i++;
    }
}

void imprime(int vetCed[], int vetMoe[]){
    int i;
    float cedulas[7] = {100, 50, 20, 10, 5, 2, 1};
    float moedas[5] = {0.5, 0.25, 0.10, 0.05, 0.01};

    printf("NOTAS:\n");
    for(i = 0; i < 6; i++){
        printf("%d nota(s) de R$ %.2f\n", vetCed[i], cedulas[i]);
    }

    printf("MOEDAS:\n");
    printf("%d moeda(s) de R$ %.2f\n", vetCed[6], cedulas[6]);

    for(i = 0; i < 5; i++){
        printf("%d moeda(s) de R$ %.2f\n", vetMoe[i], moedas[i]);
    }
}