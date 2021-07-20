#include <stdio.h>
#include <math.h>

int imprime(float i, float j);

int main(){
    /*variaveis*/
    int c = 0;
    float i = 0, j = 1;

    /*saida*/
    while(i <= 2.1){
        c++;
        if(c == 3){
            imprime(i, j);
            i += 0.2;
            j = 0;
            c = 0;
        }
        else{
            imprime(i, j);
        }
        j++;
    }
}

int imprime(float i, float j){
    int id = (int)i, jd = (int)j;
    float decI;
    decI = i - trunc(i);

    if(decI >= 0.2){
        printf("I=%.1f J=%.1f\n", i, j + i);
    }
    else{
        printf("I=%d J=%d\n", id, jd + id);
    }
    return 0;
}