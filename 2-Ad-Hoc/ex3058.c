#include <stdio.h>

float precoDeUmQuilo(float preco, int gramas){
    return (preco * 1000)/gramas;
}

int main(){
    //variaveis
    int n, gramas, i;
    float preco, precoUmKg, menorPreco;

    //entrada
    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%f %d", &preco, &gramas);

        //processamento
        precoUmKg = precoDeUmQuilo(preco, gramas);

        if(i == 0){
            menorPreco = precoUmKg;
        }
        else{
            if(precoUmKg < menorPreco){
                menorPreco = precoUmKg;
            }
        }
    }

    //saida
    printf("%.2f\n", menorPreco);
    return 0;
}