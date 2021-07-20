#include <stdio.h>
#include <string.h>
#define TAM 1000

int main(){
    /*variaveis*/
    char a[TAM], b[TAM];
    int n, tamA, tamB, i, j = 0, verifica = 1, vezes = 0; 

    /*entrada*/
    scanf("%d", &n);
    fflush(stdin);

    while(vezes < n){
        scanf(" %s %s", a, b);

        /*processamento*/
        tamA = strlen(a);
        tamB = strlen(b);

        for(i = (tamA - tamB); i < tamA; i++){
            if(a[i] != b[j]){
                verifica = 0;
                break;
            }
            j++;
        }

        /*saida*/
        if(verifica == 1){
            printf("encaixa\n");
        }
        else{
            printf("nao encaixa\n");
        }
        j = 0;
        vezes++;
        verifica = 1;
    }

    return 0;
}