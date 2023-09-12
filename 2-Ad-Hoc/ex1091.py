def imprimeQuadrante(n, m, ptDivisorX, ptDivisorY):
    if n == ptDivisorX or m == ptDivisorY:
        print("divisa")
    elif n < ptDivisorX:
        if m < ptDivisorY:
            print("SO")
        else:
            print("NO")
    else:
        if m < ptDivisorY:
            print("SE")
        else:
            print("NE")
        
#entrada
while True:
    k = int(input())
    if k == 0: break #condicao de parada

    ptDivisorX, ptDivisorY = str(input()).split()
    ptDivisorX = int(ptDivisorX)
    ptDivisorY = int(ptDivisorY)

    for i in range(0, k):
        n, m = str(input()).split()
        n = int(n)
        m = int(m)

        #processamento & saida
        imprimeQuadrante(n, m, ptDivisorX, ptDivisorY)
