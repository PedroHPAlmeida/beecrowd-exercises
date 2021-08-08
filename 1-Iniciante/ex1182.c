#include <stdio.h>
#define ORD 12

int main(){
    /*variaveis*/
    int l, i, j;
    char t;
    double m[ORD][ORD], soma;

    /*entrada*/
    scanf("%d", &l);
    scanf(" %c", &t);
    for(i = 0; i < ORD; i++){
        for(j = 0; j < ORD; j++){
            scanf("%lf", &m[i][j]);
        }
    }

    /*processamento*/
    for(j = 0; j < ORD; j++){
        soma += m[j][l];
    }

    /*saida*/
    if(t == 'S'){
        printf("%.1lf\n", soma);
    }
    else{
        printf("%.1lf\n", soma / (float)ORD);
    }

    return 0;
}