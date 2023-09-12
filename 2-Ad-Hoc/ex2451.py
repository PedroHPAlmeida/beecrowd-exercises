def percorreCol(incioCol, fimCol, passo=1):
    global comidaPac, comidaRoubada, sair, vetComidas
    for j in range(incioCol, fimCol, passo):
        if tabuleiro[i][j] == 'o':
            comidaPac += 1
            vetComidas.append(comidaPac)
        elif tabuleiro[i][j] == 'A' and comidaPac >= (totalComida - (comidaPac + comidaRoubada)):
            sair = 'S'
            break
        elif tabuleiro[i][j] == 'A' and comidaPac < (totalComida - (comidaPac + comidaRoubada)):
            sair = 'N'
            comidaRoubada += comidaPac
            comidaPac = 0

#entrada
n = input() #o URI me obrigou a ler assim :/ 
n = int(n)

tabuleiro = []
for i in range(0, n):
    tabuleiro = tabuleiro + [[] * n]

for i in range(0, n):
    tabuleiro[i] = str(input())

#processamento
totalComida = 0
for i in range(0, n): #quantidade total de comida
    totalComida += tabuleiro[i].count('o')

vetComidas = []
comidaPac = 0
comidaRoubada = 0

sair = 'N'
for i in range(0, n):
    if sair == 'S':
        break
    if i % 2 == 0:
        percorreCol(0, n)
    else:
        percorreCol(n - 1, -1, -1)


#saida
print(max(vetComidas))
