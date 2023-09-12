#entrada
s = 0
entrada = str(input()).split()
a = int(entrada[0])

for i in range(1, len(entrada)):
    if int(entrada[i]) > 0:
        n = int(entrada[i])
        break

#processamento
for i in range(0, n):
    s += a + i

#saída
print(s)
