#entrada
compriEstrada, distPedagio = str(input()).split()
compriEstrada = int(compriEstrada)
distPedagio = int(distPedagio)
custoPorKm, valorPedagio = str(input()).split()
custoPorKm = int(custoPorKm)
valorPedagio = int(valorPedagio)

#processamento
custoTotal = custoPorKm * compriEstrada
custoTotal += (compriEstrada // distPedagio) * valorPedagio

#saida
print(custoTotal)
