#include <stdio.h>

int main(){
    /*variaveis*/
    int a, b, q, r;

    /*entrada*/
    scanf("%d %d", &a, &b);

    /*processamento*/
    q = a / b; 
    r = a - b * q;

    if(r < 0){
        r = r + abs(b);
    }
    q = (a - r) / b;
    
    /*saida*/
    printf("%d %d\n", q, r);
    return 0;
}