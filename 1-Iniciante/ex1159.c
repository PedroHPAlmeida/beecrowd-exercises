#include <stdio.h>

int main(){
    /*variaveis*/
    int x, i = 0, j, s = 0;

    /*entrada & processamento*/
    while(1){
        scanf("%d", &x);
        if(x == 0){
            break;
        }

        j = x;
        while(i < 5){
            if(j % 2 == 0){
                s += j;
                i++;
            }
            j++;
        }
        printf("%d\n", s); //saida
        s = 0;
        i = 0;
    }
    return 0;
}