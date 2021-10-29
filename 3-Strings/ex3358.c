#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
    //variaveis
    int n, i, j, k;
    char sobrenome[43];
    char vogais[6] = "AEIOU";

    //entrada
    scanf("%d", &n);
    getchar(); //fflush nao funcionou
    for(i = 0; i < n; i++){
        gets(sobrenome);

        //processamento
        int cont = 0;
        j = 0;
        while(sobrenome[j] != '\0' && cont < 15){
            char a = toupper(sobrenome[j]);
            for(k = 0; k < 5; k++){
                char b = toupper(vogais[k]);
                if(a == b){
                    cont = 0;
                    break;
                }
                cont++;
            }
            j++;
        }

        //saida
        if(cont == 15){
            printf("%s nao eh facil\n", sobrenome);
        }
        else{
            printf("%s eh facil\n", sobrenome);
        }
    }
    return 0;
}