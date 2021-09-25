#include <stdio.h>
#include <string.h> 

int main(){
    char palavra[20];
    scanf("%s", palavra);

    int tam = strlen(palavra);

    if(tam > 9){printf("palavrao\n");}
    else{printf("palavrinha\n");}
    
    return 0;
}