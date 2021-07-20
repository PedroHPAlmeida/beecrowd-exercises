#include <stdio.h>

int dentro(int x, int y, int x1, int y1, int x2, int y2);

int main(){
    /*variaveis*/
    int x1, x2, y1, y2, x, y, n;
    int dentroFazenda = 0;
    int i, j;

    /*entrada && processamento*/
    for(i = 0; ; i++){
        scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
        if(x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0){
            break;
        }
        scanf("%d", &n);
        for(j = 0; j < n; j++){
            scanf("%d %d", &x, &y);
            if(dentro(x, y, x1, y1, x2, y2)){
                dentroFazenda++;
            }
        }
        /*saída*/
        printf("Teste %d\n", i + 1);
        printf("%d\n", dentroFazenda);
        dentroFazenda = 0;
    }
    return 0;
}

int dentro(int x, int y, int x1, int y1, int x2, int y2){
    if(x >= x1 && x <= x2 && y <= y1 && y >= y2){
        return 1;
    }
    else{
        return 0;
    }
}