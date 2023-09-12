#entrada
a, b, c = str(input()).split()
a = float(a)
b = float(b)
c = float(c)

#processamento/saída
if (a + b) > c and (a + c) > b and (c + b) > a:
    perimetro = a + b + c
    print("Perimetro = {:.1f}".format(perimetro))
else:
    area = ((a + b) * c) / 2
    print("Area = {:.1f}".format(area))
