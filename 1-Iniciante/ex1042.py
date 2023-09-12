#entrada
n1, n2, n3 = str(input()).split()
n1 = int(n1)
n2 = int(n2)
n3 = int(n3)

#processamento
digitado = [n1, n2, n3]
crescente = sorted(digitado)

#saída 
for cont in range(0,3):
    print("{}".format(crescente[cont]))

print("")

for cont in range(0,3):
    print("{}".format(digitado[cont]))
