#entrada
n = int(input())
entrada = str(input()).split()

#processamento
cortes = []
for i in range(0, len(entrada)):
    cortes.append(int(entrada[i]) - 1)

resultado = sum(cortes)

#saida
print(resultado)
