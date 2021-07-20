#include <stdio.h>

int main(){
    /*variaveis*/
    int n, i;

    /*entrada*/
    scanf("%d", &n);

    /*processamento & saida*/
    for(i = 2; i < 10001; i++){
        if(i % n == 2){
            printf("%d\n", i);
        }
    }

    return 0;
}