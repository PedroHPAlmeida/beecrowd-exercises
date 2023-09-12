#entrada
n = int(input())

#processamento
n = str(n)
msg = 'NO es de Mala Suerte'
for i in range(0, len(n)):
    if n[i] == '1' and i != len(n) - 1:
        if n[i + 1] == '3':
            msg = 'es de Mala Suerte'
            break
#saida
print(n, msg)
