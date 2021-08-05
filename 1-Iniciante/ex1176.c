#include <stdio.h>

int fibonacci(int x);

int main(){
    /*variaveis*/
    int t, n, i, fib;

    /*entrada & processamento*/
    scanf("%d", &t);

    for(i = 0; i < t; i++){
        scanf("%d", &n);
        fib = fibonacci(n);
        printf("Fib(%d) = %d\n", n, fib); //saida
    }
    return 0;
}   

int fibonacci(int x){
    /*variaveis*/
    int i, fib[60];

    /*processamento*/
    fib[0] = 0;
    fib[1] = 1;

    if(x > 1){
        for(i = 2; i < 60; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }

    /*retorno*/
    return fib[x];
}