#include <stdio.h>

int main(){
    //variaveis
    int largCont, compCont, altCont;
    int largNav, compNav, altNav;
    int qntdConteiners;

    //entrada
    scanf("%d %d %d", &largCont, &compCont, &altCont);
    scanf("%d %d %d", &largNav, &compNav, &altNav);

    //processamento
    qntdConteiners = (largNav / largCont) * (compNav / compCont) * (altNav / altCont);

    //saida
    printf("%d\n", qntdConteiners);

    return 0;
}