#entrada & processamento
media = x = 0
while True:
    n = int(input())
    if n < 0:
        break
    x += 1
    media += n
media /= x

#saida
print(f'{media:.2f}')
