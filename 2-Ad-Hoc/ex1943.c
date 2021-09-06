#include <stdio.h>

int main(){
    //variaveis
    int n, i, tops[7] = {1, 3, 5, 10, 25, 50, 100};

    //entrada
    scanf("%d", &n);

    //processamento & saida
    for(i = 0; i < 7; i++){
        if(n <= tops[i]){
            printf("Top %d\n", tops[i]);
            break;
        }
    }
    return 0;
}