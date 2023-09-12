#entrada
while True:
    hi, mi, hf, mf = str(input()).split()
    hi = int(hi)
    mi = int(mi) 
    hf = int(hf)
    mf = int(mf)

    if hi == 0 and mi == 0 and hf == 0 and mf == 0: #condicao de parada
        break

    #processamento
    tempoInicio = hi * 60 + mi #tempo decorrido ate o moemento que ela dormiu (em minutos)
    tempoFinal =  hf * 60 + mf
    if tempoFinal < tempoInicio:
        tempoFinal += 24 * 60

    diferenca = abs(tempoFinal - tempoInicio)

    #saida
    print(diferenca)
