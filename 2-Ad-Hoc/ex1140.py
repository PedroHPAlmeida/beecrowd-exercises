#entrada
while True:
    frase = str(input())
    if frase[0] == '*':
        break

    #processamento
    letra = frase[0].upper()
    frase = frase.split()
    palavras = len(frase)

    flag = 'Y'
    for i in range(1, palavras):
        if frase[i][0].upper() != letra:
            flag = 'N'
            break
    #saida
    print(flag)
