#include <stdio.h>

void distancia(int t, int v, int *d);

int main(){
    /*variaveis*/
    int n, t, v, d = 0, i;

    /*entrada*/
    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%d %d", &t, &v);
        distancia(t, v, &d);
    }

    /*saída*/
    printf("%d\n", d);

    return 0;
}

void distancia(int t, int v, int *d){
    *d += t * v;
}