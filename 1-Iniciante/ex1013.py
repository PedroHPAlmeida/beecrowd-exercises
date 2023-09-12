#entrada
a, b, c = str(input()).split()

#processamento
a = int(a)
b = int(b)
c = int(c)

maiorAB = ((a + b) + abs(a - b)) / 2
maior = ((maiorAB + c) + abs(maiorAB - c)) / 2

#saída
print("{:.0f} eh o maior".format(maior))
