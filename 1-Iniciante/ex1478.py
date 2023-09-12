#entrada
while True:
    n = int(input())
    if n <= 0:
        break

    m = []
    for i in range(n): #criacao da matriz
        m = m + [[0] * n]

    for i in range(0, n): #preenchendo a 1a linha da matriz
        m[0][i] = i + 1

    for i in range(1, n): #preenchendo a 1a coluna da matriz
        m[i][0] = i + 1

    for i in range(1, n): #preenchendo o restante da matriz
        for j in range(1, n):
            m[i][j] = m[i - 1][j - 1]

    #saida
    for i in range(0, n):
        for j in range(0, n):
            if j < n - 1:
                print('{:>3}'.format(m[i][j]), end=' ')
            else:
                print('{:>3}'.format(m[i][j]), end='')
        print()
    print()
