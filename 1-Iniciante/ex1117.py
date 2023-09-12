#função que faz a validação da entrada
def validacao(n):
    if n < 0 or n > 10:
        print('nota invalida')
        return 0
    else:
        return 1

#entrada
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
