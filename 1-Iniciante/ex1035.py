#entrada
a, b, c, d = str(input()).split()
a = int(a)
b = int(b)
c = int(c)
d = int(d)

#processamento/saída
if b > c and d > a and c + d > a + b and c >= 0 and d >= 0 and a % 2 == 0:
    print("Valores aceitos")
else:
    print("Valores nao aceitos")
