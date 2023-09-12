#entrada
n = int(input())
bolas = str(input()).split()
for i, num in enumerate(bolas): bolas[i] = int(num)

#processamento
linha = n - 1
while linha > 0:
    for i in range(0, linha):
        bolas[i] = bolas[i] * bolas[i + 1]
    linha -= 1

#saida
print('preta' if bolas[0] == 1 else 'branca')
