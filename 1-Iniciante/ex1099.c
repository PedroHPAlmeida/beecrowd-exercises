#include <stdio.h>

void imparesConsec(int x, int y);

int main(){
    /*variaveis*/
    int n, i, x, y;

    /*entrada/processamento/saida*/
    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%d %d", &x, &y);
        imparesConsec(x, y);
    }

    return 0;
}

void imparesConsec(int x, int y){
    /*variaveis*/
    int max, min, i, soma = 0;

    /*verificacao do maior valor*/
    max = y;
    min = x;
    if(x > y){
        max = x;
        min = y;
    }

    /*verificacao dos impares entre min e max*/
    for(i = min + 1; i < max; i++){
        if(i % 2 == 1){
            soma += i;
        }
    }

    /*saida*/
    printf("%d\n", soma);
}