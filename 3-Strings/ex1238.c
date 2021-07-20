#include <stdio.h>
#include <string.h>
#define TAM 51

int main()
{
    /*variaveis*/
    char strA[TAM], strB[TAM], strC[TAM * 2 - 1], strAux[100];
    int i = 0, j = 0, v = 0, flagA = 1, flagB = 1, vezes;

    /*entrada*/
    scanf("%d", &vezes);

    while(v < vezes){
        fflush(stdin);

        scanf(" %s %s", strA, strB);

        /*processamento*/
        while (flagA || flagB){
            if (strA[i] != '\0' && flagA){
                strC[j] = strA[i];
                j++;
            }
            else{
                flagA = 0;
            }

            if (strB[i] != '\0' && flagB){
                strC[j] = strB[i];
                j++;
            }
            else{
                flagB = 0;
            }

            i++;
        }

        strC[j] = '\0';

        /*saida*/
        printf("%s\n", strC);
        v++;
        i = 0;
        j = 0;
        flagA = 1;
        flagB = 1;
    }
    return 0;
}