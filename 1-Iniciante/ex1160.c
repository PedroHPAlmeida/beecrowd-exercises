#include <stdio.h>

int main(){
    /*variaveis*/
    int t, i = 0, pA, pB, crescAnualA, crescAnualB, j, anos = 0;
    float g1, g2;

    /*entrada & processamento*/
    scanf("%d", &t);

    while(i < t){
        scanf("%d %d %f %f", &pA, &pB, &g1, &g2);

        while(pA <= pB){
            crescAnualA = floor(pA * (g1 / 100));
            crescAnualB = floor(pB * (g2 / 100));
            pA += crescAnualA;
            pB += crescAnualB;
            anos += 1;
            if(anos > 100){
                break;
            }
        }

        if(anos <= 100){                   //saida
            printf("%d anos.\n", anos);
        }
        else{
            printf("Mais de 1 seculo.\n");
        }
        
        pA = 0;
        pB = 0;
        crescAnualA = 0;
        crescAnualB = 0; 
        anos = 0;

        i++;
    }
    return 0;
}