#include <stdio.h>

void msg(int x);
int mod(int x);
int sinal(int x);

int main(){
    /*variaveis*/
    int n, x, i;

    /*entrada*/
    scanf("%d", &n);

    for(i = 0; i < n; i++){
        scanf("%d", &x);
        msg(x);
    }
    return 0;
}

/*processamento & saída*/

void msg(int x){
    int sin, parImpa;
    sin = sinal(x);
    parImpa = mod(x);

    if(sin == -1){
        printf("NULL\n");
    }
    else{
        if(parImpa){
            printf("EVEN ");
        }
        else{
            printf("ODD ");
        }

        if(sin){
            printf("POSITIVE\n");
        }
        else{
            (printf("NEGATIVE\n"));
        }
    }
}

int mod(int x){
    if(x % 2 == 0)
        return 1;
    else
        return 0;
}

int sinal(int x){
    if(x > 0)
        return 1;
    else if(x < 0)
        return 0;
    else
        return -1;
}