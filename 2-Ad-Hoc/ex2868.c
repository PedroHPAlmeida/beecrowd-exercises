#include <stdio.h>
#include <stdlib.h>

int main(){
    //variaveis
    int n, v1, v2, respCerto, respErrada, diferenca;
    char operacao, igual;
    char *errou;
    int i, j;

    //entrada
    scanf("%d", &n);

    for(j = 0; j < n; j++){
        scanf("%d %c %d %c %d", &v1, &operacao, &v2, &igual, &respErrada);

        //processamento
        if(operacao == '+'){
            respCerto = v1 + v2;
        }
        else if(operacao == '-'){
            respCerto = v1 - v2;
        }
        else{
            respCerto = v1 * v2;
        }

        diferenca = abs(respCerto - respErrada);
        
        errou = (char*) malloc(diferenca + 5);
        errou[0] = 'E';
        for(i = 1; i < diferenca + 1; i++){
            errou[i] = 'r';
        }
        errou[i] = 'o';
        errou[i + 1] = 'u';
        errou[i + 2] = '!';
        errou[i + 3] = '\0';

        //saida
        printf("%s\n", errou);
        free(errou);
    }
    return 0;
}