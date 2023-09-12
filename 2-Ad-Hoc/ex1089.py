#entrada
while True:
    n = int(input())
    if n == 0:
        break

    entrada = str(input()).split()
    Hi = []
    for i in range(0, n):
        Hi.append(int(entrada[i]))

    #processamento
    picos = 2
    for i in range(2, n):
        if (Hi[i - 2] > Hi[i - 1] and Hi[i - 1] < Hi[i]) or (Hi[i - 2] < Hi[i - 1] and Hi[i - 1] > Hi[i]):
            picos += 1
    #saida
    if picos % 2 == 0:
        print(picos)
    else:
        print(picos - 1)
        