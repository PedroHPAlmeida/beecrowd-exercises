#entrada
vitCor, empCor, saldCor, vitFla, empFla, saldFla = str(input()).split()
vitFla = int(vitFla)
empFla = int(empFla)
saldFla = int(saldFla)
vitCor = int(vitCor)
empCor = int(empCor)
saldCor = int(saldCor)

#processamento & saida
totalFla = vitFla * 3 + empFla
totalCor = vitCor * 3 + empCor

if totalFla == totalCor:
    if saldFla > saldCor:
        print('F')
    elif saldCor > saldFla:
        print('C')
    else:
        print('=')
else:
    if totalFla > totalCor:
        print('F')
    else:
        print('C')
