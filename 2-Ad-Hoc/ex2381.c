#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char **AlocaMatriz(int m, int n);
void insertion(int n, char **v);

int main(){
    //variaveis
    int n, k, i;
    char **listaNomes;

    //entrada
    scanf("%d %d", &n, &k);
    listaNomes = AlocaMatriz(n, 21);
    fflush(stdin);

    for(i = 0; i < n; i++){
        scanf("%s", listaNomes[i]); 
    }

    insertion(n, listaNomes); //ordena os nomes

    //saida
    printf("%s\n", listaNomes[k - 1]); 
    return 0;
}

char **AlocaMatriz(int m, int n){
    char **M;
    int i;
 
    M = (char **)malloc(sizeof(char *)*m);
    for(i = 0; i < m; i++){
        M[i] = (char *)malloc(sizeof(char)*n);
    }
    return M;
}

void insertion(int n, char **v){
    int i, j;
    char aux[21];

    for (i = 1; i < n; ++i) {
        strcpy(aux, v[i]);
        for (j = i-1; j >= 0 && strcmp(v[j], aux) > 0; --j) 
            strcpy(v[j + 1], v[j]);
        strcpy(v[j + 1], aux);
    }
}