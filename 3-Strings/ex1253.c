#include <stdio.h>
#include <string.h>

void decodificador(char frase[], int desloc, char fraseDecodificada[]){
    char caracter;
    char alfabeto[27] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    int i, tam = strlen(frase), indice, j, pos;

    for(i = 0; i < tam; i++){
        caracter = frase[i];
        for(j = 0; j < 27; j++){
            if(caracter == alfabeto[j]){
                indice = j;
                break;
            }
        }
        pos = indice - desloc;
        if(pos < 0){
            pos = 27 - (desloc - indice + 1);
        } 
        fraseDecodificada[i] = alfabeto[pos];
    }
    fraseDecodificada[i] = '\0';
}


int main(){
    //variaveis
    int n, i, desloc = 0;
    char frase[51], fraseDecodificada[51];

    //entrada
    scanf("%d", &n);

    for(i = 0; i < n; i++){
        fflush(stdin);
        scanf("%s", frase);
        scanf("%d", &desloc);

        //processamento
        decodificador(frase, desloc, fraseDecodificada);

        //saida
        printf("%s\n", fraseDecodificada);
    }
    return 0;
}