#entrada
a, b, c = input().split()
pi = float(3.14159)

#processamento/saída
a = float(a)
b = float(b)
c = float(c)

print("TRIANGULO: {:.3f}".format((a * c) / 2))
print("CIRCULO: {:.3f}".format((pi * c**2)))
print("TRAPEZIO: {:.3f}".format(((a + b) * c)/2))
print("QUADRADO: {:.3f}".format(b**2))
print("RETANGULO: {:.3f}".format(a * b))
