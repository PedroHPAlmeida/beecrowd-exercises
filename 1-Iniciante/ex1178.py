#entrada
x = float(input())

#saida
n = []
n.append(x)
print(f'N[0] = {n[0]:.4f}')
for i in range(1, 100):
    n.append(n[i - 1] / 2)
    print(f'N[{i}] = {n[i]:.4f}')
