#entrada
while True:
    try:
        entrada = str(input()).split()

        #processamento
        binN1 = bin(int(entrada[0]))[2:]
        binN2 = bin(int(entrada[1]))[2:]
        tamBinN1 = len(binN1)
        tamBinN2 = len(binN2)
        result = ''

        resto = ''                        #completando o numero binario para que possua 32 bits
        for i in range(0, 32 - tamBinN1):
            resto = resto + '0'
        binN1 = resto + binN1
        
        resto = ''
        for i in range(0, 32 - tamBinN2):
            resto = resto + '0'
        binN2 = resto + binN2

        for i in range(0, 32): #soma equivocada no modo Mofiz, sem o Carry 
            if binN1[i] == '1' and binN2[i] == '1':
                result = result + '0'
            elif binN1[i] == '1' or binN2[i] == '1':
                result = result + '1'
            else:
                result = result + '0'
        
        resultDecimal = int(result, 2)

        #saida
        print(resultDecimal)
    except IndexError or EOFError: #para ser aceita no URI tire o IndexError, mantenha apenas o EOFError
        break
