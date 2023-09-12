def preencheMat(matriz, inicio, fim, valor): #funcao que vai preencher a matriz
    for i in range(inicio, fim):             #sempre de forma quadrada           
        for j in range(inicio, fim):         #uma matriz quadrada de ordem maior que 2 possui outras matrizes quadradas dentro dela
            mat[i][j] = valor                #baseando-se nisso essa solução foi desenvolvida   
                                             #codigo comentado para posterior compreenssão   
#entrada                                     #depure o codigo para entender melhor   
while True:
    mat = []
    n = int(input())

    if n == 0:
        break
    
    for i in range(0, n):  #criacao da matriz
        mat = mat + [[1] * n]

    fim = n - 1
    valor = 2
    if n > 2:
        for i in range(1, n - 1): #preenchendo a matriz
            preencheMat(mat, i, fim, valor)
            valor += 1
            fim -= 1

    for i in range(0, n): #saida
        for j in range(0, n):
            if j < n - 1:
                print('{:>3}'.format(mat[i][j]), end=' ')
            else:
                print('{:>3}'.format(mat[i][j]), end='')
        print()
    print()
