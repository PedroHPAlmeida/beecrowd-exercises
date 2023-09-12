while True:
    try:
        var_1 = input()[:100]
        var_2 = input()[:100]
        var_3 = input()[:100]
        print(var_1, var_2, var_3, sep='')
        print(var_2, var_3, var_1, sep='')
        print(var_3, var_1, var_2, sep='')
        print(var_1[0:10], var_2[0:10], var_3[0:10], sep='')
    except EOFError:
        break
