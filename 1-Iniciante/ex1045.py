#entrada
valores = []
a, b, c = str(input()).split()
a = float(a)
b = float(b)
c = float(c)

valores.append(a)
valores.append(b)
valores.append(c)

#processamento
valores = sorted(valores, reverse=True)
a = valores[0]
b = valores[1]
c = valores[2]

#processamento/saída
if a >= (b + c): #forma um triangulo?
    print("NAO FORMA TRIANGULO")
else:
    if a**2 == (b**2 + c**2):
        print("TRIANGULO RETANGULO") #triangulo retangulo
    if a**2 > b**2 + c**2:
        print("TRIANGULO OBTUSANGULO") #triangulo obtu
    if a**2 < (b**2 + c**2):
        print("TRIANGULO ACUTANGULO") #triangulo acutan
    if a == b == c:
        print("TRIANGULO EQUILATERO") #triangulo equilatero
    elif a == b or a == c or b == c:
        print("TRIANGULO ISOSCELES") #triangulo isosceles
