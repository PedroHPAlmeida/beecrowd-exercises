#entrada
nome = str(input())
salarioFixo = float(input())
vendas = float(input())

#processamento
salarioLiquido = salarioFixo + (vendas * 0.15)

#saída
print("TOTAL = R$ {:.2f}".format(salarioLiquido))
