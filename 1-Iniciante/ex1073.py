#entrada
n = int(input())

#processamento & saida
for i in range(2, n + 1):
    if i % 2 == 0:
        print(f'{i}^{2} = {i**2}')
