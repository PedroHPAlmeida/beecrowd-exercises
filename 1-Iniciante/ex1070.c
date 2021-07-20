#include <stdio.h>

int main(){
    /*variaveis*/
    int i, impar = 0, cont = 6;

    /*entrada*/
    scanf("%d", &i);

    /*processamento & saída*/
    while(impar < cont){
        if(i % 2 == 1){
            printf("%d\n", i);
            impar++;
        }
        i++;
    }
    return 0;
}