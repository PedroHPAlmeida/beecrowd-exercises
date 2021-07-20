#include <stdio.h>
#define VALIDA 2002

int login(int senha);

int main(){
    /*variaveis*/
    int i;
    int senha;

    /*processamento*/
    while(1){
        scanf("%d",&senha);
        login(senha);

        if(login(senha) == 1){
            break;
        }
        printf("Senha Invalida\n");
    }

    /*saida*/
    printf("Acesso Permitido\n");
    return 0;
}

int login(int senha){
    if(senha == VALIDA){
        return 1;
    }
    else{
        return 0;
    }
}