#entrada
x = int(input())
while True:
    z = int(input())
    if z > x:
        break

c = 1
s = x
i = x + 1 

#processamento
while s < z:
    c += 1
    s += i
    i += 1

#saída
print(c)
