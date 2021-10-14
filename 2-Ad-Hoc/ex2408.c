#include <stdio.h>

void selection (int n, int v[]);

int main(){
    //variaveis
    int pontuacoes[3];

    //entrada
    scanf("%d %d %d", &pontuacoes[0], &pontuacoes[1], &pontuacoes[2]);

    //processamento
    selection(3, pontuacoes);

    //saida
    printf("%d\n", pontuacoes[1]);
    return 0;
}

void selection (int n, int v[]){
    int i, j;
    for(i = 0; i < n-1; ++i) {
        int min = i;
        for(j = i+1; j < n; ++j){
            if(v[j] < v[min])  min = j;
        }
        int x = v[i]; v[i] = v[min]; v[min] = x;
    }
}