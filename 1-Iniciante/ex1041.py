#entrada
x, y = str(input()).split()
x = float(x)
y = float(y)

#processamento
if x == 0 and y == 0:
    print("Origem")
elif x == 0:
    print("Eixo Y")
elif y == 0:
    print("Eixo X")
else:
    if x > 0:
        if y > 0:
            print("Q1")
        else:
            print("Q4")
    elif x < 0:
        if y > 0:
            print("Q2")
        else:
            print("Q3")  
            