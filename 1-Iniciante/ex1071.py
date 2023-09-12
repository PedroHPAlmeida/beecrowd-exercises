#entrada
i = int(input())
f = int(input())
s = 0

#processamento
if i > f:
    aux = i
    i = f
    f = aux

for n in range(i + 1, f, 1):
    if n % 2 == 1:
        s += n

#saida
print(s)
