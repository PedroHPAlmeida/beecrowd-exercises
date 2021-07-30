#include <stdio.h>

int main(){
    /*variaveis*/
    int x, y, mai, men, i;

    /*entrada*/
    scanf("%d", &x);
    scanf("%d", &y);

    /*processamento & saída*/
    mai = x;
    men = y;
    if(y > x){
        mai = y;
        men = x;
    }

    for(i = men + 1; i < mai; i++){
        if(i % 5 == 2 || i % 5 == 3){
            printf("%d\n", i);
        }
    }

    return 0;
}