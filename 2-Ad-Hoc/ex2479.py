#entrada
n = int(input())
lista = []
boas = ruins = 0
for i in range(0, n):
    comportamento, nome = str(input()).split()

    #processamento
    if comportamento == '+':
        boas += 1
    else:
        ruins += 1
    
    lista.append(nome)
    lista = sorted(lista)
    
    #saida
for i in range(0, n):
    print(lista[i])

print(f'Se comportaram: {boas} | Nao se comportaram: {ruins}')
