#include <stdio.h>

int main(){
    //variaveis
    int metros, tamPista, pontoParada;

    //entrada
    scanf("%d %d", &metros, &tamPista);

    //processamento
    pontoParada = metros;
    if(metros >= tamPista){
        pontoParada = metros % tamPista;
    }

    //saida
    printf("%d\n", pontoParada);

    return 0;
}