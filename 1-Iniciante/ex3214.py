#entrada
e, f, c = str(input()).split()
e = int(e)
f = int(f)
c = int(c)

#processamento
totalGarrafasVazias = e + f
totalRefri = 0

while totalGarrafasVazias >= c:
    aux = totalGarrafasVazias // c
    totalRefri += aux
    totalGarrafasVazias = aux + (totalGarrafasVazias % c)

#saida
print(totalRefri)
 