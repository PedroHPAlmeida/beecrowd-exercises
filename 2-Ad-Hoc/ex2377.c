#include <stdio.h>

int main(){
    //variaveis
    int compriEstrada, distPedagio;
    int custoPorKm, valorPedagio;
    int custTotal = 0;

    //entrada
    scanf("%d %d", &compriEstrada, &distPedagio);
    scanf("%d %d", &custoPorKm, &valorPedagio);

    //processamento
    custTotal = custoPorKm * compriEstrada;
    custTotal += (compriEstrada / distPedagio) * valorPedagio;

    //saida
    printf("%d\n", custTotal);
    return 0;
}