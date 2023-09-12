#entrada
n = int(input())
tops = [1, 3, 5, 10, 25, 50, 100]

#processamento & saida
for top in tops:
    if n <= top:
        print("Top {}".format(top))
        break
    