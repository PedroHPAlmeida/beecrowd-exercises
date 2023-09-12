while True:
    #entrada
    x, y = str(input()).split()
    x = int(x)
    y = int(y)

    if x == 0 or y == 0: #condição de parada
        break
    #processamento & saída
    if x > 0:
        if y > 0:
            print('primeiro')
        else:
            print('quarto')
    else:
        if y > 0:
            print('segundo')
        else:
            print('terceiro')
