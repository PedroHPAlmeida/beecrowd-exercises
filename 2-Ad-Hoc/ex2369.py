#entrada
consumo = int(input())

#processamento
valor = 7
if consumo > 100:
    valor += (consumo - 100) * 5
    consumo -= consumo - 100
if consumo > 30:
    valor += (consumo - 30) * 2
    consumo -= consumo - 30
if consumo > 10:
    valor += (consumo - 10)

#saida
print(valor)
