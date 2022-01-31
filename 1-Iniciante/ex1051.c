#include <stdio.h>

int main(){
    /*variaveis*/
    float salario, faixa, imposto = 0;

    /*entrada*/
    scanf("%f", &salario);

    /*processamento & saida*/
    faixa = salario / 1000.0;

    if(faixa <= 2){
        printf("Isento\n");
    }
    else{
        if(faixa <= 3){
            imposto = (salario - 2000) * 0.08;
        }
        else if(faixa <= 4.5){
            imposto = 1000 * 0.08;
            imposto += (salario - 3000) * 0.18;
        }
        else{
            imposto = 1000 * 0.08;
            imposto += 1500 * 0.18;
            imposto += (salario - 4500) * 0.28;
        }
        printf("R$ %.2f\n", imposto);
    }
    
    return 0;
}