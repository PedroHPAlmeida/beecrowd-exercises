#include <stdio.h>

int main(){
    /*variaveis*/
    int n, i, j, x, primo = 1;
    
    /*entrada & processamento*/
    scanf("%d", &n);
    for(i = 0; i < n; i++){
        scanf("%d", &x);
        for(j = 2; j <= (x / 2); j++){
            if(x % j == 0){
                primo = 0;
                break;
            }
        }
        if(primo == 1){ //saida
            printf("%d eh primo\n", x);
        }
        else{
            printf("%d nao eh primo\n", x);
        }
        primo = 1;
    }
    return 0;
}