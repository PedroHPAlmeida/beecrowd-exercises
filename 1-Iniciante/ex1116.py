#entrada
n = int(input())
i = 0
while i < n:
    n1, n2 = str(input()).split()
    n1 = int(n1)
    n2 = int(n2)

    #processamento & saída
    if n2 == 0:
        print('divisao impossivel')
    else:
        print(f'{n1 / n2:.1f}')
    i += 1
