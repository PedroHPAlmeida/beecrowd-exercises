from math import trunc
#entrada
while True:
    a, b, c = str(input()).split()
    a = int(a)
    b = int(b)
    c = int(c)
    if a == 0:
        break

    #processamento
    volumeParale = a * b * c
    arestaCubo = trunc(volumeParale ** (1/3))

    #saida
    print(arestaCubo)
