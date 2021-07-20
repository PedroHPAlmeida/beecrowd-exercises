#include <stdio.h>

int main(){
    /*variaveis*/
    int i, j, aux = 8, c = 0;

    /*saida*/
    for(i = 1, j = aux - 1; i < 10; j--){
        c++;
        if(c == 3){
            printf("I=%d J=%d\n", i, j);
            i+= 2;
            aux += 2;
            j = aux;
            c = 0;
        }
        else{
            printf("I=%d J=%d\n", i, j);
        }
    }
    return 0;
}