#entrada
x, y = str(input()).split()
x = int(x)
y = int(y)

#saída
for i in range(1, y + 1):
    if i % x == 0:
        print(i)
    else:
        print(i, end=' ')
