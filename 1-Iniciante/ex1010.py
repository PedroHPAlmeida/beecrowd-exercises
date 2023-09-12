#entrada
codigo, qtd, valor = str(input()).split()
codigo2, qtd2, valor2 = str(input()).split()
#processamento

codigo = int(codigo)
codigo2 = int(codigo2)
qtd = int(qtd)
qtd2 = int(qtd2)
valor = float(valor)
valor2 = float(valor2)

total = (valor * qtd) + (valor2 * qtd2)
#saída
print("VALOR A PAGAR: R$ {:.2f}".format(total))
