#entrada
while True:
    n = int(input())
    if n == 0:
        break

    for i in range(0, n):
        planeta, anoRecebida, tempo = str(input()).split()
        anoRecebida = int(anoRecebida)
        tempo = int(tempo)

        #processamento
        if i == 0:
            primeira = anoRecebida - tempo
            firstPlanet = planeta
        if anoRecebida - tempo < primeira:
            primeira = anoRecebida - tempo
            firstPlanet = planeta
        
    #saida
    print(firstPlanet)
