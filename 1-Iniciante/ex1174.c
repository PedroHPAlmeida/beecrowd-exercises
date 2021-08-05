#include <stdio.h>

int main(){
    /*variaveis*/
    int i;
    float a[100];

    /*entrada*/
    for(i = 0; i < 100; i++){
        scanf("%f", &a[i]);
    }

    /*processamento*/
    for(i = 0; i < 100; i++){
        if(a[i] <= 10){
            printf("A[%d] = %.1f\n", i, a[i]); //saida
        }
    }
    return 0; 
}