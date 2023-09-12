#entrada
n = int(input())

#entrada & processamento
for i in range(0, n):
    x, y = str(input()).split()
    x = int(x)
    y = int(y)

    j = s = 0
    k = x
    while j < y:
        if k % 2 == 1:
            s += k
            j += 1
        k += 1
    print(s) #saida
    