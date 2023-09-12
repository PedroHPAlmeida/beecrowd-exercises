#entrada
while True:
    n = int(input())
    if n == 0:
        break

    tempos = str(input()).split()
    #processamento
    tempoTotal = 10
    for i in range(1, len(tempos)):
        if (int(tempos[i]) - int(tempos[i - 1])) < 10:
            tempoTotal += int(tempos[i]) - int(tempos[i - 1])
        else:
            tempoTotal += 10

    #saida
    print(tempoTotal)
