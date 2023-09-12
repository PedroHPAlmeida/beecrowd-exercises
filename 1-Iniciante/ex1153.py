#entrada
n = int(input())
fat = 1

#processamento
for i in range(n, 1, -1):
    fat *= i

#saida
print(fat)
