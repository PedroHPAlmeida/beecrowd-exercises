#include <stdio.h>
#include <math.h>

#define PI 3.141592654

int main(){
    //variaveis
    float angulo, distanciaArvore, alturaElfo;
    float alturaArvore, qntdCordao;

    //entrada
    while (scanf("%f %f %f", &angulo, &distanciaArvore, &alturaElfo) != EOF){
        //processamento
        alturaArvore = tan(angulo * (PI / 180.0)) * distanciaArvore + alturaElfo;
        qntdCordao = alturaArvore * 5.0;

        //saida
        printf("%.2f\n", qntdCordao);
    }
    
    return 0;
}