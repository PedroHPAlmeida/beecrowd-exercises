#entrada
tabela = [[400, 15], [800, 12], [1200, 10], [2000, 7], [4]]
salario = float(input())

#processamento
percentual = tabela[len(tabela) - 1][0]

for i in range(0, len(tabela)):
    if salario <= tabela[i][0]:
        percentual = tabela[i][1]
        break

reajuste = salario * (percentual/100)

#saída
print(f'Novo salario: {salario + reajuste:.2f}')
print(f'Reajuste ganho: {reajuste:.2f}')
print(f'Em percentual: {percentual} %')
