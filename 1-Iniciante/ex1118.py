#função que faz a validação da entrada
def validacao(n):
    if n < 0 or n > 10:
        print('nota invalida')
        return 0
    else:
        return 1

#entrada
x = 1
while x == 1:
    nota1 = float(input())
    valida = validacao(nota1)
    while valida == 0:
        nota1 = float(input())
        valida = validacao(nota1)

    nota2 = float(input())
    valida = validacao(nota2)
    while valida == 0:
        nota2 = float(input())
        valida = validacao(nota2)

    #processamento
    media = (nota1 + nota2) / 2

    #saída
    print(f'media = {media:.2f}')

    while True: 
        print('novo calculo (1-sim 2-nao)')
        x = int(input())
        if x > 0 and x < 3:
            break
