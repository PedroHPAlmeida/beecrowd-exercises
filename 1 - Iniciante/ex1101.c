#include <stdio.h>

void imprimeSeq(int m, int n);

int main(){
    /*variaveis*/
    int m, n;

    /*entrada/processamento/saida*/
    while(1){
        scanf("%d %d", &m, &n);
        if(m <= 0 || n <= 0){
            break;
        }
        imprimeSeq(m, n);
    }
    
    return 0;
}

void imprimeSeq(int m, int n){
    /*variaveis*/
    int max, min, i, soma = 0;

    /*verificacao do maior valor*/
    max = m;
    min = n;
    if(n > m){
        max = n;
        min = m;
    }

    /*saida*/
    for(i = min; i <= max; i++){
        printf("%d ", i);
        soma += i;
    }
    printf("Sum=%d\n", soma);
}