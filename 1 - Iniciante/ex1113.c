#include <stdio.h>

int main(){
    /*variaveis*/
    int x, y;

    /*entrada/processamento/saida*/
    while(1){
        scanf("%d %d", &x, &y);
        if (x == y){
            break;
        }
        if(x < y){
            printf("Crescente\n");
        }
        else{
            printf("Decrescente\n");
        }
    }

    return 0;
}