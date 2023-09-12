def fases(fase, faseAnterior, proxFase):
    for i in range(0, fase, 2): #definindo as quartas de final
        equipe1, equipe2 = str(input()).split()
        equipe1 = int(equipe1)
        equipe2 = int(equipe2)
        if equipe1 > equipe2:
            proxFase.append(faseAnterior[i])
        else:
            proxFase.append(faseAnterior[i + 1])

#entrada
oitavas = []
quartas = [] 
semi = []
final = []
oitavas = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P']

#processamento
fases(16, oitavas, quartas)
fases(8, quartas, semi)
fases(4, semi, final)

#saida
equipe1, equipe2 = str(input()).split()
equipe1 = int(equipe1)
equipe2 = int(equipe2)
if equipe1 > equipe2:
    print(final[0])
else:
    print(final[1])
