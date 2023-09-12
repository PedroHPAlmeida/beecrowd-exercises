#entrada
n, lGarrafa, lCuia = str(input()).split()
n = int(n)
lGarrafa = float(lGarrafa)
lCuia = float(lCuia)

nomes = str(input()).split()

#processamento
aux = lGarrafa
cont = -1
while True:
    cont += 1
    if aux - lCuia <= 0:
        break
    else:
        aux = round(aux - lCuia, 1)

nome = nomes[cont % n]

#saida
print('{} {:.1f}'.format(nome, aux))
