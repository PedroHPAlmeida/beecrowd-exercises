#entrada
diaI = str(input()).split(' ') #inicio do evento
diaI = int(diaI[1])
hhI, mmI, ssI = str(input()).split(' : ')
hhI = int(hhI)
mmI = int(mmI)
ssI = int(ssI)

diaT = str(input()).split(' ') #término do evento
diaT = int(diaT[1]) 
hhT, mmT, ssT = str(input()).split(' : ')
hhT = int(hhT)
mmT = int(mmT)
ssT = int(ssT)

#processamento
inicio = ((diaI - 1) * 86400) + (hhI * 3600) + (mmI * 60) + (ssI)
termino = ((diaT - 1) * 86400) + (hhT * 3600) + (mmT * 60) + (ssT)
tempo = termino - inicio
if inicio > termino:
    tempo = inicio - termino

dias = horas = min = seg = 0
    
if tempo >= 86400:
    dias = tempo // 86400
    tempo -= dias * 86400

if tempo >= 3600:
    horas = tempo // 3600
    tempo -= horas * 3600

if tempo >= 60:
    min = tempo // 60
    tempo -= min * 60

seg = tempo

#saida
print(f'{dias} dia(s)')
print(f'{horas} hora(s)')
print(f'{min} minuto(s)')
print(f'{seg} segundo(s)')
