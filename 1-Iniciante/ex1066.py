par = impar = pos = neg = 0

#entrada & processamento
for i in range(0, 5):
    n = int(input())
    if n % 2 == 0:
        par += 1
    else:
        impar += 1
    if n > 0:
        pos += 1
    elif n < 0:
        neg += 1

#saída
print(f'''{par} valor(es) par(es)
{impar} valor(es) impar(es)
{pos} valor(es) positivo(s)
{neg} valor(es) negativo(s)''')
