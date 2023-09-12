def precoDeUmQuilo(preco, gramas):
    return (preco * 1000) / gramas

#entrada
n = int(input())
for i in range(0, n):
    preco, gramas = str(input()).split()
    preco = float(preco)
    gramas =  int(gramas)
    
    #processamento
    precoUmQuilo = precoDeUmQuilo(preco, gramas)

    if i == 0:
        menorPreco = precoUmQuilo
    else:
        if precoUmQuilo < menorPreco:
            menorPreco = precoUmQuilo

#saida
print('{:.2f}'.format(menorPreco))
