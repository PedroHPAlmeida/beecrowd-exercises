def Efrase(frase):
    nums = ('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')

    if frase.count('.') == 1 and frase[len(frase) - 1] != '.' or frase == '.':
        return False
    elif frase.count('.') > 1:
        return False
    for j in range(0, 10):
        if nums[j] in frase:
            return False

    return True


#entrada
while True:
    try:
        frase = str(input()).strip().split()

        #processamento
        fraseValida = ''
    
        for i in range(0, len(frase)): #frase valida (eliminando palavras invalidas)
            if Efrase(frase[i]):
                fraseValida = fraseValida + ' '  + frase[i]
        
        fraseValida = fraseValida.strip().split()
        nPalavras = len(fraseValida)
        m = ponto = 0

        for i in range(0, nPalavras): #calculando o tamanho medio das palavras
            m += len(fraseValida[i])
            ponto += fraseValida[i].count('.')

        m -= ponto
        if nPalavras > 0:
            m = m // nPalavras
        else:
            m = 0

        #saida
        if m <= 3:
            print(250)
        elif m <= 5:
            print(500)
        else:
            print(1000)
    except EOFError:
        break
