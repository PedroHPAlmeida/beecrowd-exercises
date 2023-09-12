pontuacoes = str(input()).split()
for i, n, in enumerate(pontuacoes): pontuacoes[i] = int(n)
pontuacoes = sorted(pontuacoes)
print(pontuacoes[1])
