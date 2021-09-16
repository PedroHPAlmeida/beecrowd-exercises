#include <stdio.h>
#include <string.h>

void decodificador(char frase[], int desloc, char fraseDecodificada[]){
    int i, tam = strlen(frase), indice, pos;

    for(i = 0; i < tam; i++){
        indice = frase[i];
        pos = indice - desloc;
        if(pos < 65){
            pos = 90 - (65 - (indice - desloc) - 1);
        } 
        fraseDecodificada[i] = pos;
    }
    fraseDecodificada[i] = '\0';
}


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