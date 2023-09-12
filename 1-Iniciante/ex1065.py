numeros = []
par = 0

#entrada & processamento
for i in range(0, 5):
    numeros.append(int(input()))
    if numeros[i] % 2 == 0:
        par += 1

#saída
print(f'{par} valores pares')
