#include <stdio.h>

void imprimeQuadrante(int n, int m, int ptDivisorX, int ptDivisorY);

int main(){
    //variaveis
    int k, i;
    int ptDivisorX, ptDivisorY;
    int n, m;

    //entrada
    while(1){
        scanf("%d", &k);
        if(k == 0){ //condicao de parada
            break;
        }

        scanf("%d %d", &ptDivisorX, &ptDivisorY);

        for(i = 0; i < k; i++){
            scanf("%d %d", &n, &m);
            //processamento e saida
            imprimeQuadrante(n, m, ptDivisorX, ptDivisorY);
        }
    }
    return 0;
}

void imprimeQuadrante(int n, int m, int ptDivisorX, int ptDivisorY){
    if(n == ptDivisorX || m == ptDivisorY){
        printf("divisa\n");
    }
    else if(n < ptDivisorX){
        if(m < ptDivisorY){
            printf("SO\n");
        }
        else{
            printf("NO\n");
        }
    }
    else{
        if(m < ptDivisorY){
            printf("SE\n");
        }
        else{
            printf("NE\n");
        }
    }
}