#include <stdio.h>

int main(){
    /*variaveis*/
    int n[10], i, x;

    /*entrada*/
    scanf("%d", &x);

    /*processamento*/
    n[0] = x;
    for(i = 1; i < 10; i++){
        n[i] = n[i - 1] * 2;
    }

    /*saida*/
    for(i = 0; i < 10; i++){
        printf("N[%d] = %d\n", i, n[i]);
    }
    return 0;
}