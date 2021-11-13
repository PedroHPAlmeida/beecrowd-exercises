#include <stdio.h>

int main(){
    //variaveis
    int hh, mm;
    int hAng, mAng;

    //entrada
    while(scanf("%d %d", &hAng, &mAng) != EOF){
        //processamento
        hh = hAng / 30;
        mm = mAng / 6;

        //saida
        printf("%02d:%02d\n", hh, mm);
    }
    return 0;
}