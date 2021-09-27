#include <stdio.h>

int main(){
    //variaveis
    int vitCor, empCor, saldCor, vitFla, empFla, saldFla;
    int totCor, totFla;
    char result; 

    //entrada
    scanf("%d %d %d %d %d %d", &vitCor, &empCor, &saldCor, &vitFla, &empFla, &saldFla);

    //processamento
    totCor = vitCor * 3 + empCor;
    totFla = vitFla * 3 + empFla;

    if(totCor == totFla && saldCor == saldFla){
        result = '=';
    }
    else{
        if(totCor > totFla){
            result = 'C';
        }
        else if(totFla > totCor){
            result = 'F';
        }
        else{
            if(saldCor > saldFla){
                result = 'C';
            }
            else{
                result = 'F';
            }
        }
    }

    //saida
    printf("%c\n", result);

    return 0;
}