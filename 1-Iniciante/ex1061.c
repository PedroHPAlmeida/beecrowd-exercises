#include <stdio.h>

void leDia(int *dia);
void leitura(int *h, int *m, int *s);
void duracao(int *dias, int *horas, int *min, int *seg, int dI, int hI, int mI, int sI, int dT, int hT, int mT, int sT);

int main(){
    /*variaveis*/
    int diaI, diaT;    //dia inicio e dia termino
    int hhI, mmI, ssI; //hora, min, seg incio
    int hhT, mmT, ssT; //hora, min, seg termino
    int dias = 0, horas = 0, min = 0, seg = 0; //duracao

    /*entrada*/
    leDia(&diaI); //inicio
    leitura(&hhI, &mmI, &ssI);
    
    leDia(&diaT); //termino
    leitura(&hhT, &mmT, &ssT);

    /*processamento*/
    duracao(&dias, &horas, &min, &seg, diaI, hhI, mmI, ssI, diaT, hhT, mmT, ssT); //funcao que calcula a duracao do evento

    /*saida*/
    printf("%d dia(s)\n", dias);
    printf("%d hora(s)\n", horas);
    printf("%d minuto(s)\n", min);
    printf("%d segundo(s)\n", seg);

    return 0;
}

void leDia(int *dia){
    int i;
    char str[7], d[3] = {'\0','\0','\0'};
    char nums[11] = {'0','1','2','3','4','5','6','7','8','9'};

    scanf(" %6[^\n]s", str);
    
    for(i = 0; i < 10; i++){
        if(str[5] == nums[i]){
            d[0] = str[4];
            d[1] = str[5];
            d[2] = '\0';
            *dia = atoi(d);
            break;
        }
    }

    d[0] = str[4];
    *dia = atoi(d);
}

void leitura(int *h, int *m, int *s){
    int i;
    char tempo[13], hh[3] = {'\0','\0','\0'}, mm[3] = {'\0','\0','\0'}, ss[3] = {'\0','\0','\0'};

    scanf(" %12[^\n]s", tempo);

    hh[0] = tempo[0];
    hh[1] = tempo[1];

    mm[0] = tempo[5];
    mm[1] = tempo[6];

    ss[0] = tempo[10];
    ss[1] = tempo[11];

    *h = atoi(hh);
    *m = atoi(mm);
    *s = atoi(ss);
}

void duracao(int *dias, int *horas, int *min, int *seg, int dI, int hI, int mI, int sI, int dT, int hT, int mT, int sT){
    int tempo, inicio, fim;

    inicio = ((dI - 1) * 86400) + (hI * 3600) + (mI * 60) + sI; 
    fim = ((dT - 1) * 86400) + (hT * 3600) + (mT * 60) + sT;
    tempo = fim - inicio; //Calcula a diferença (em segundos) entre o inicio e o fim do evento
    if(inicio > fim){
        tempo = inicio - fim; 
    }

    if(tempo >= 86400){
        *dias = tempo / 86400;
        tempo -= *dias * 86400; 
    }
    if(tempo >= 3600){
        *horas = tempo / 3600;
        tempo -= *horas * 3600;
    }
    if(tempo >= 60){
        *min = tempo / 60;
        tempo -= *min * 60; 
    }
    *seg = tempo;
}