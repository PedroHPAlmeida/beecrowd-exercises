#include <stdio.h>

long long int fibonacci(int x);

int main(){
    /*variaveis*/
    int n, t, i;
    long long int fib;

    /*entrada & processamento*/
    scanf("%d", &t);

    for(i = 0; i < t; i++){
        scanf("%d", &n);
        fib = fibonacci(n);
        printf("Fib(%d) = %lld\n", n, fib); //saida
    }
    return 0;
}   

long long int fibonacci(int x){
    /*variaveis*/
    long long int fib[61];
    int i;

    /*processamento*/
    fib[0] = 0;
    fib[1] = 1;

    if(x > 1){
        for(i = 2; i <= x; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
    }

    /*retorno*/
    return fib[x];
}