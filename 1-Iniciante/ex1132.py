#entrada
x = int(input())
y = int(input())

mai = x
men = y

if x < y:
    mai = y
    men = x

#processamento & saida
soma = 0
for c in range(men, mai + 1):
    if c % 13 != 0:
        soma += c

print(soma)
