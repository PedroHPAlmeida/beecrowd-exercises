#include <stdio.h>
#define ORD 12

int main(){
    /*variaveis*/
    int i, j, n = 0;
    char t;
    double m[ORD][ORD], soma = 0;

    /*entrada & processamento*/
    scanf("%c", &t);
    for(i = 0; i < ORD; i++){
        for(j = 0; j < ORD; j++){
            scanf("%lf", &m[i][j]);
            if(j > i && i + j > ORD - 1){
                soma += m[i][j];
                n++;
            }
        }
    }

    /*saida*/
    if(t == 'S'){
        printf("%.1lf\n", soma);
    }
    else{
        printf("%.1lf\n", soma / (float)n);
    }
    return 0;
}