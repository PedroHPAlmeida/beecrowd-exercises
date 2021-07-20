#include <stdio.h>

int main(){
    /*variaveis*/
    int n, i;

    /*entrada*/
    scanf("%d", &n);

    /*processamento & saída*/
    for(i = 1; i < 11; i++){
        printf("%d x %d = %d\n", i, n, n*i);
    }

    return 0;
}