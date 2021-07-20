#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(){
    /*variaveis*/
    int i, tamFrase, tauto = 1;
    char frase[500];
    char letra;

    /*entrada*/
    while(1){
        fflush(stdin);
        scanf("%[^\n]", frase);
        if(frase[0] == '*'){
            break;
        }
        /*processamento*/
        letra = toupper(frase[0]);
        tamFrase = strlen(frase);

        for(i = 1; i < tamFrase; i++){
            if(frase[i] == ' '){
                if(letra != toupper(frase[i+1])){
                    tauto = 0;
                    break;
                }
            }
        }

        /*saída*/
        if(tauto == 1){
            printf("Y\n");
        }
        else{
            printf("N\n");
        }
        tauto = 1;
    }
    return 0;
}