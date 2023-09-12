#entrada
n, k = str(input()).split()
n = int(n)
k = int(k)

listaNomes = []

for i in range(0, n):
    listaNomes.append(str(input()))

#processamento
listaNomes = sorted(listaNomes)

#saida
print(listaNomes[k - 1])
