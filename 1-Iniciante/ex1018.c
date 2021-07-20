#include <stdio.h>

int main ()
{
    int cem=0, cinq=0, vint=0, dez=0, cinc=0, dois=0, uno=0, valor = 0, valorI=0;

    scanf("%d", &valor);
    valorI = valor;

        if (valor >= 100) //Se o valor for maior que 99, pelo menos uma cédula de 100 será necessária
        {    
        cem = valor / 100;
        valor = valor - cem * 100;
        }

        if (valor >= 50)   //Se depois de dividir o valor em notas de 100 ainda sobrar um valor maior que 50, pelo menos uma nota de 50 será utilizada
        {
            cinq = 1;
            valor = valor - 50;
        }

        if (valor >= 20)
        {
            vint = valor / 20;
            valor = valor - vint * 20;
        }

        if (valor >= 10)
        {
            dez = valor / 10;
            valor = valor - dez * 10;
        }

        if (valor >= 5)
        {
            cinc = 1;
            valor = valor - 5;
        }

        if (valor >= 2)
        {
            dois = valor / 2;
            valor = valor - dois * 2;
        }

        if (valor > 0)
        {
            uno = 1;
            valor = valor - 1;
        }   
    
    printf("%d\n", valorI);
    printf("%d nota(s) de R$ 100,00\n", cem);
    printf("%d nota(s) de R$ 50,00\n", cinq);
    printf("%d nota(s) de R$ 20,00\n", vint);
    printf("%d nota(s) de R$ 10,00\n", dez);
    printf("%d nota(s) de R$ 5,00\n", cinc);
    printf("%d nota(s) de R$ 2,00\n", dois);
    printf("%d nota(s) de R$ 1,00\n", uno);

    return 0;
}