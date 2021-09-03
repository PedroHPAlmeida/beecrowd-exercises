#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int situacoes(char tabuleiro[], int n); 

int main(){
    /*variaveis*/
    int n, i;
    char *tabuleiro, *tabFuturo, ePossivel;

    while(1){
        /*entrada*/
        scanf("%d", &n);
        if(n == 0){
            break;
        }

        ePossivel = 'N';
        tabuleiro = NULL;
        tabFuturo = NULL;

        tabuleiro = (char *) malloc(n + 1); //alocando o vetor de caracteres
        tabFuturo = (char *) malloc(n + 1);
        fflush(stdin);
        scanf("%s", tabuleiro);

        /*processamento*/
        for(i = 0; i < n; i++){
            strcpy(tabFuturo, tabuleiro);
            if(tabuleiro[i] == '.'){
                tabFuturo[i] =  'X';
                if(situacoes(tabFuturo, n)){
                    ePossivel = 'S';
                    break;
                }
            }
        }
        /*saida*/
        printf("%c\n", ePossivel);
    }

    return 0;
}

int situacoes(char tabuleiro[], int n){
    char *pont;

    pont = strstr(tabuleiro, "XXX");
    if(pont != NULL){
        return 1;
    }
    pont = strstr(tabuleiro, "...");
    if(pont != NULL){
        return 0;
    }
    pont = strstr(tabuleiro, "X.X");
    if(pont != NULL){
        return 0;
    }
    pont = strstr(tabuleiro, ".XX");
    if(pont != NULL){
        return 0;
    }
    pont = strstr(tabuleiro, "XX.");
    if(pont != NULL){
        return 0;
    }
    return 1;
}