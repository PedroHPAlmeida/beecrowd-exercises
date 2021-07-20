#include <stdio.h>

int main(){
    /*variaveis*/
    int n, q, i, total = 0, coelho = 0, rato = 0, sapo = 0;
    char t;
    float c, s, r;

    /*entrada*/
    scanf("%d", &n);
    for(i = 0; i < n; i++){
        fflush(stdin);
        scanf("%d %c", &q, &t);
        total += q;
        switch (t){
            case 'C':
                coelho += q;
                break;
            case 'S':
                sapo += q;
                break;
            case 'R':
                rato += q;
                break;
        }
    } 
    c = ((float)coelho / total) * 100;
    r = ((float)rato / total) * 100;
    s = ((float)sapo / total) * 100;

    /*saida*/
    printf("Total: %d cobaias\n", total);
    printf("Total de coelhos: %d\n", coelho);
    printf("Total de ratos: %d\n", rato);
    printf("Total de sapos: %d\n", sapo);
    printf("Percentual de coelhos: %.2f %%\n", c);
    printf("Percentual de ratos: %.2f %%\n", r);
    printf("Percentual de sapos: %.2f %%\n", s);

    return 0;
}