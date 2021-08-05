#include <stdio.h>

int main(){
    /*variaveis*/
    int x[10], i;

    /*entrada*/
    for(i = 0; i < 10; i++){
        scanf("%d", &x[i]);
    }

    /*processamento*/
    for(i = 0; i < 10; i++){
        if(x[i] <= 0){
            x[i] = 1;
        }
    }

    /*saida*/
    for(i = 0; i < 10; i++){
        printf("X[%d] = %d\n", i, x[i]);
    }

    return 0;
}