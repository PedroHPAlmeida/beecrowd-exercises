#include <stdio.h>

int main(){
    //variaveis
    unsigned int e, f, c, totalRefri = 0, totalGarrafasVazias, aux;

    //entrada
    scanf("%d %d %d", &e, &f, &c);

    //processamento
    totalGarrafasVazias = e + f;

    while(totalGarrafasVazias >= c){
        aux = totalGarrafasVazias / c;
        totalRefri += aux;
        totalGarrafasVazias = aux + (totalGarrafasVazias % c);
    }    

    //saida
    printf("%d\n", totalRefri);
    return 0;
}