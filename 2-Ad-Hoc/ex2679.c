#include <stdio.h>

int main(){
    //variaveis
    int n;

    //entrada
    scanf("%d", &n);

    //processamento
    n += 1;
    if(n % 2 == 1){
        n += 1;
    }

    //saida
    printf("%d\n", n);

    return 0;
}