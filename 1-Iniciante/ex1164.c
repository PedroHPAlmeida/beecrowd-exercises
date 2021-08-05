#include <stdio.h>

int main(){
    /*variaveis*/
    int n, i = 0, j, somaDiv = 0, x;

    /*entrada & processamento*/
    scanf("%d", &n);
    while(i < n){
        scanf("%d", &x);

        for(j = 1; j <= (x / 2); j++){
            if(x % j == 0){
                somaDiv += j;
            }
        }

        if(somaDiv == x){ //saida
            printf("%d eh perfeito\n", x);
        }
        else{
            printf("%d nao eh perfeito\n", x);
        }
        somaDiv = 0;
        i++;
    }
    return 0;
}