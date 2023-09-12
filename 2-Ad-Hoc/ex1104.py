def leCartas(vetCartas, n): #leitura do conjunto de cartas
    entrada = str(input()).split()
    for i in range(0, n):
        vetCartas.append(int(entrada[i]))

#entrada
while True:
    nCAlice, nCBeatriz = str(input()).split()
    nCAlice = int(nCAlice)
    nCBeatriz = int(nCBeatriz)

    if nCAlice == 0 and nCBeatriz == 0: #condicao de parada
        break

    cartasAlice = []
    cartasBeatriz = []
    leCartas(cartasAlice, nCAlice)
    leCartas(cartasBeatriz, nCBeatriz)

    #processamento
    cartasAlice = set(cartasAlice) #tirando as cartas repetidas
    cartasBeatriz = set(cartasBeatriz) #tirando as cartas repetidas
    interseccao = cartasAlice & cartasBeatriz #cartas que ambas possuem
    cartasAlice = cartasAlice - interseccao #eliminando as cartas que ambas possuem
    cartasBeatriz = cartasBeatriz - interseccao #eliminando as cartas que ambas possuem

    #cartasUnicas(cartasAlice, cartasBeatriz)

    #saida
    if len(cartasAlice) < len(cartasBeatriz):
        print(len(cartasAlice))
    else:
        print(len(cartasBeatriz))
