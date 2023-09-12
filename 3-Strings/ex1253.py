def decodificador(frase, desloc):
    tam = len(frase)
    fraseDecodificada = str()
    for i in range(0, tam):
        codAscii = ord(frase[i])
        caracter = codAscii - desloc
        if caracter < 65:
            caracter = 90 - (65 - (codAscii - desloc) - 1)
        fraseDecodificada += chr(caracter)
    print(fraseDecodificada)

#entrada
n = int(input())

for i in range(0, n):
    frase = str(input())
    desloc = int(input())

    #processamento & saida
    decodificador(frase, desloc)
