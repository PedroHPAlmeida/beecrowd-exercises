#entrada
while True:
    numBancos, nDeben = str(input()).split()
    numBancos = int(numBancos)
    nDeben = int(nDeben)

    if numBancos == 0 and nDeben == 0: #condicao de parada
        break 

    reservasBancos = str(input()).split()
    for i in range(0, numBancos): #convertendo as reservas
        reservasBancos[i] = int(reservasBancos[i])

    #processamento
    for i in range(0, nDeben):
        bankDeve, bankCredor, valorDeb = str(input()).split()
        bankDeve = int(bankDeve)
        bankCredor = int(bankCredor)
        reservasBancos[bankDeve - 1] -= int(valorDeb)
        reservasBancos[bankCredor - 1] += int(valorDeb)

    #saida
    possivelPagar = 'S'
    for i in reservasBancos:
        if i < 0:
            possivelPagar = 'N'

    print(possivelPagar)
