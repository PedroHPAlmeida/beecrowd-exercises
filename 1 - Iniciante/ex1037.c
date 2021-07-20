#include <stdio.h>

int main ()
{
    float valor;

    scanf("%f", &valor);

    if (valor > 100 || valor < 0)
    {
        printf("Fora de intervalo\n");
    }
    else if (valor > 75 && valor <= 100)
    {
        printf("Intervalo (75,100]\n");
    }
    else if (valor > 50 && valor <= 75)
    {
        printf("Intervalo (50,75]\n");
    }
    else if (valor > 25 && valor <=50)
    {
        printf("Intervalo (25,50]\n");
    }
    else
    {
        printf("Intervalo [0,25]\n");
    }
    
    return 0;
}