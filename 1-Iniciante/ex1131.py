#entrada
c = 0
vGremio = vInter = empates = 0 #vitorias e empates

while True:
    c += 1
    inter, gremio = str(input()).split()
    inter = int(inter)
    gremio = int(gremio)

    if inter > gremio:
        vInter += 1
    elif inter < gremio:
        vGremio += 1
    else:
        empates += 1

    print('Novo grenal (1-sim 2-nao)')
    confirma = int(input())
    if confirma == 2:
        break

#processamento e saida
print(f'{c} grenais')
print(f'Inter:{vInter}')
print(f'Gremio:{vGremio}')
print(f'Empates:{empates}')

if vInter > vGremio:
    print('Inter venceu mais')
elif vInter < vGremio:
    print('Gremio venceu mais')
else:
    print('Nao houve vencedor')
