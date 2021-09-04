#include <stdio.h>
#include <string.h>

int main(){
    /*variaveis*/
    int i, tam;
    char numero[19], msg[21];

    /*entrada*/
    scanf("%s", &numero);

    /*processamento*/
    strcpy(msg, "NO es de Mala Suerte");
    tam =  strlen(numero);

    for(i = 0; i < tam; i++){
        if(numero[i] == '1' && i < tam){
            if(numero[i + 1] == '3'){
                strcpy(msg, "es de Mala Suerte");
                break;
            }
        }
    }
    
    /*saida*/
    printf("%s %s\n", numero, msg);

    return 0;
}