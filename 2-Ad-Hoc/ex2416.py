#entrada
metros, tamPista = str(input()).split()
metros = int(metros)
tamPista = int(tamPista)

#processamento
pontoParada = metros
if metros >= tamPista:
    pontoParada = metros % tamPista

#saida
print(pontoParada)
