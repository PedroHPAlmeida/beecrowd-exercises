#entrada
cod, qnt = str(input()).split()
cod = int(cod)
qnt = int(qnt)

#processamento
cardapio = [[1,4.0],[2,4.5],[3,5.0],[4,2.0],[5,1.5]]

for lin in range(0,5):
    if cod == cardapio[lin][0]:
        preco = cardapio[lin][1]

total = preco * qnt

#saída
print("Total: R$ {:.2f}".format(total))
