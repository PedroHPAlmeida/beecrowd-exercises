#include <stdio.h>

int main (){

    /*Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, 
    correspondente às quatro notas de um aluno. 
    Calcule a média com pesos 2, 3, 4 e 1, respectivamente, 
    para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ".*/
    
    float n1, n2, n3, n4, media;
    float nota_exame, media_final;

    //printf("Digite as 4 notas do aluno: \n");
    scanf("%f%f%f%f", &n1, &n2, &n3, &n4);

    media = (n1*2 + n2*3 + n3*4 + n4*1)/10.0; //divide pela soma dos pesos
    printf("Media: %.1f\n", media);

    /* Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.".
    Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
    Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, 
    o programa deve imprimir a mensagem "Aluno em exame.".*/

    if (media >= 7.0) {
        printf("Aluno aprovado.\n");
    } 
    else if (media < 5.0) {
        printf("Aluno reprovado.\n");
    }
    else {
        printf("Aluno em exame.\n");
    /*No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida por ele.
    Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada.
    Recalcule a média (some a pontuação do exame com a média anterior e divida por 2).
    E imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais )
    ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos).
    Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha
    uma mensagem "Media final: " seguido da média final para esse aluno.*/

        //printf("Digite a nota do exame: ");
        scanf("%f", &nota_exame);
        printf("Nota do exame: %.1f\n", nota_exame);

        media_final = (media + nota_exame)/2.0;

        if (media_final < 5.0){
            printf("Aluno reprovado.\n");
        }
        else {
            printf("Aluno aprovado.\n");
        }
        printf("Media final: %.1f\n", media_final);
    }
    
    return 0;
}