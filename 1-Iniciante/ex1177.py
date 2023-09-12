#entrada
t = int(input())

#saida
n = []
j = 0
for i in range(0, 1000):
    if j == t:
        j = 0
    n.append(j)
    print(f'N[{i}] = {j}')
    j += 1
