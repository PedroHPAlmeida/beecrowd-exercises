#entrada & processamento
par = []
impar = []

def imprimeList(lista, parOuImpar):
    tam = len(lista)
    for j in range(0, tam):
        print(f'{parOuImpar}[{j}] = {lista[j]}')

for i in range(0, 15):
    n = int(input())
    if n % 2 == 0:
        par.append(n)
    else:
        impar.append(n)

    if len(par) == 5:
        imprimeList(par, 'par') #saida
        par.clear()
    if len(impar) == 5:
        imprimeList(impar, 'impar')
        impar.clear()

if len(impar) > 0:
    imprimeList(impar, 'impar')
if len(par) > 0:
    imprimeList(par, 'par')
