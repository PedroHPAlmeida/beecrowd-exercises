#include <stdio.h>
#include <stdlib.h>

int main(){
    //variaveis
    int inscritos, cont = 0, i;
    int *c;

    //entrada
    scanf("%d", &inscritos);
    c = (int*) malloc(inscritos * sizeof(int));
    
    for(i = 0; i < inscritos; i++){
        scanf("%d", &c[i]);
    }

    //processamento
    for(i = 0; i < inscritos; i++){
        if(c[i] == 1){
            cont++;
        }
    }

    //saida
    printf("%d\n", cont);

    free(c);
    return 0;
}