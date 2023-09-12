#entrada
while True:
    l, r = str(input()).split()
    l = int(l)
    r = int(r)
    if l == 0 and r == 0:
        break
    #processamento
    s = l + r
    #saida
    print(s)
    