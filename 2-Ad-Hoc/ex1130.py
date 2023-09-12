def situacoesProibidas(tab):
    situacoes = ('...', 'X.X', '.XX', 'XX.')
    for i in range(0, 4):
        if situacoes[i] in tab:
            return False
    return True
    
#entrada
while True:
    n = int(input())
    if n == 0: #condicao de parada
        break
    tabuleiro = str(input())

    #processamento
    ePossivel = 'N'

    for i in range(0, n):
        tabFuturo = ''
        if tabuleiro[i] == '.':
            tabFuturo = tabFuturo + tabuleiro[0:i] + 'X' + tabuleiro[i + 1:]
            if ('XXX' in tabFuturo) or situacoesProibidas(tabFuturo):
                ePossivel = 'S'
                break

    #saida
    print(ePossivel)
