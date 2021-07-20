#include <stdio.h>

int main(){
    /*variaveis*/
    int i, j;

    /*saida*/
    for(i = 1, j = 7; i <= 9; j--){
        if(j == 5){
            printf("I=%d J=%d\n", i, j);
            j = 8;
            i+= 2;
        }
        else{
            printf("I=%d J=%d\n", i, j);
        }  
    }
    return 0; 
}