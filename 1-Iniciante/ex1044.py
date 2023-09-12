#entrada
n1, n2 = str(input()).split()
n1 = int(n1)
n2 = int(n2)

#processamento/saída
if n1 % n2 == 0 or n2 % n1 == 0:
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")
