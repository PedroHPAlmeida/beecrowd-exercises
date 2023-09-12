#variaveis
c = 0
num = i = 1

#entrada
n = int(input())

#processamento & saída
for i in range(1, n + 1):
    while True:
        c += 1
        print(num, end=' ')
        num += 1
        if c == 3:
            print('PUM')
            c = 0
            num += 1
            break
