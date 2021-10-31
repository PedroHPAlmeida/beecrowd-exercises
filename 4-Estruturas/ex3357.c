#include <stdio.h>
#include <stdlib.h>
#include <math.h>

char **AlocaMatriz(int m, int n);
void LiberaMatriz(char **M, int m);
void leNome(char **mat, int n);

int main(){
    //variaveis
    int n, i;
    double lGarrafa, lCuia;
    char **nomes;

    //entrada
    scanf("%d %lf %lf", &n, &lGarrafa, &lCuia);
    getchar();
    nomes = AlocaMatriz(n, 13);
    leNome(nomes, n);

    //processamento
    double aux = lGarrafa;
    int cont = -1;
    while(1){
        cont++;
        if(aux - lCuia <= 0){
            break;
        } 
        else{
            aux = round((aux - lCuia) * 10.0) / 10.0;
        }
    }
    
    //saida
    printf("%s %.1lf\n", nomes[cont % n], aux);
    LiberaMatriz(nomes, n);
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

void LiberaMatriz(char **M, int m){
  int i;
  for(i = 0; i < m; i++)
    free(M[i]);
  free(M);
}

void leNome(char **mat, int n){
    int i;
    for(i = 0; i < n; i++){
        scanf("%s", mat[i]);
    }
}