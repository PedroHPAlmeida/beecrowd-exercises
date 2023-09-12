#entrada
inicio, fim = str(input()).split()
inicio = int(inicio)
fim = int(fim)

#processamento
if inicio < fim:
    tempo = fim - inicio
else:
    tempo = (24 - inicio) + fim

#saída
print(f'O JOGO DUROU {tempo} HORA(S)')
