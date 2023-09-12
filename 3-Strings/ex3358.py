n = int(input())
vogais = 'AEIOU'

for i in range(n):
    sobrenome = str(input())
    cont = 0
    for letra in sobrenome:
        if not letra.upper() in vogais:
            cont += 1
        else:
            cont = 0 
        if cont == 3: break
    if cont >= 3:
        print('{} nao eh facil'.format(sobrenome))
    else:
        print('{} eh facil'.format(sobrenome))
