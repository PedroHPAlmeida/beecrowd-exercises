numeros = []
positivos = 0
media = 0 

#entrada & processamento
for i in range(0, 6):
    numeros.append(float(input()))
    if numeros[i] >= 0:
        positivos += 1
        media += numeros[i]

media = media / positivos

#saída
print(f'{positivos} valores positivos')
print(f'{media:.1f}')
