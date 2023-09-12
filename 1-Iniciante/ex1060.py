#entrada & processamento
aculm = 0
for n in range(0, 6):
    num = float(input())
    if num > 0:
        aculm += 1

#saída
print(f'{aculm} valores positivos')
