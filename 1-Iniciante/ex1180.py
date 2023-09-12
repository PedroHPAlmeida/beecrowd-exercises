def separaValores(lista, leitura, n):
    for i in range(0, n):
        lista.append(int(leitura[i]))

#entrada
n = int(input())
x = []

#processamento
leitura = str(input()).split()
separaValores(x, leitura, n)
menor = x[0]
pos = 0
for i in range(1, n):
    if x[i] < menor:
        menor = x[i]
        pos = i

#saida
print(f'Menor valor: {menor}')
print(f'Posicao: {pos}')
