#include <stdio.h>

main(){
    /*variaveis*/
    int final, i;

    /*entrada*/
    scanf("%d", &final);

    /*processamento & saída*/
    for(i = 1; i <= final; i++){
        if(i % 2 == 1){
            printf("%d\n", i);
        }
    }
}