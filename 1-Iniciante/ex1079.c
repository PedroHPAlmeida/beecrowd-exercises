#include <stdio.h>

int main(){
    /*variaveis*/
    int i, n; 
    float n1, n2, n3, result;

    /*entrada & processamento & saida*/
    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%f %f %f", &n1, &n2, &n3);
        result = ((n1 * 2)+(n2 * 3)+(n3 * 5))/(2 + 3 + 5);
        printf("%.1f\n", result);
    }

    return 0;
}