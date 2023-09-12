#entrada
nFuncionarios = int(input())
qEventos = int(input())

#processamento
mesas = []
for i in range(1, nFuncionarios + 1): #inserindo funcionarios nas mesas
    mesas.append(i)

for i in range(0, qEventos):
    entrada = str(input()).split()
    eTipo = int(entrada[0])
    a = int(entrada[1])
    if eTipo == 1: #update
        b = int(entrada[2])
        aux = mesas.index(b)
        mesas[mesas.index(a)] = b
        mesas[aux] = a
    else:
        flag = 0
        indice = a 
        while mesas[indice - 1] != a:
            flag += 1
            indice = mesas[indice - 1]

        print(flag) #saida
        