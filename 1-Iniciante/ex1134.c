#include <stdio.h>

int main(){
    /*variaveis*/
    int alc = 0, gas = 0, dis = 0, tipo;

    /*entrada & processamento*/
    while(1){
        while(1){
            scanf("%d", &tipo);
            if(tipo > 0 && tipo < 5){
                break;
            }
        }

        switch (tipo){
            case 1:
                alc += 1;
                break;
            case 2:
                gas += 1;
                break;
            case 3:
                dis += 1;
                break;
        }

        if(tipo == 4){
            break;
        }
    }

    /*saída*/
    printf("MUITO OBRIGADO\n");
    printf("Alcool: %d\n", alc);
    printf("Gasolina: %d\n", gas);
    printf("Diesel: %d\n", dis);

    return 0;
}