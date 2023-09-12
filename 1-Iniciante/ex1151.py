#entrada
n = int(input())
fib = [0, 1]

#saída
print(fib[0], end=' ')
print(fib[1], end=' ')
for i in range(2, n):
    if i == n - 1:
        fib.append(fib[i - 2] + fib[i - 1])
        print(fib[i])
    else:
        fib.append(fib[i - 2] + fib[i - 1])
        print(fib[i], end=' ')
        