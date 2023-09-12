def leVetor(vetor):
    entrada = str(input()).split()
    for i in entrada:
        vetor.append(int(i))

#entrada
tamVet, rodadas = str(input()).split()
tamVet = int(tamVet)
rodadas = int(rodadas)
vetor = []

leVetor(vetor)

for i in range(0, rodadas):
    limInf, limSup, kMenor, guga, dabriel = str(input()).split()
    limInf = int(limInf)
    limSup = int(limSup)
    kMenor = int(kMenor)
    guga = int(guga)
    dabriel = int(dabriel) 

    #processamento
    intervalo = vetor[limInf - 1:limSup]
    intervalo = sorted(intervalo)
    menor = intervalo[kMenor - 1]
    contKEsimo = intervalo.count(menor)

    difGuga = abs(contKEsimo - guga)
    difDabri = abs(contKEsimo - dabriel)


    result = 'E'
    if difGuga < difDabri: result = 'G'
    elif difDabri < difGuga: result = 'D'

    #saida
    print('{} {} {}'.format(menor, contKEsimo, result))
