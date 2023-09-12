# functions
def MDC(a, b):
    while(b != 0):
        resto = a % b
        a = b
        b = resto
    return a


def simplificacao(a, b):
    mdc = MDC(a, b)
    fracao = []
    fracao.append(int(a / mdc))
    fracao.append(int(b / mdc))
    return fracao


def tratamento(expressao):
    lista = []
    lista.append(int(expressao[0]))
    lista.append(int(expressao[2]))
    lista.append(int(expressao[4]))
    lista.append(int(expressao[6]))
    return lista


def soma(nums, op):
    numDen = []
    numDen.append(nums[0] * nums[3] + nums[2] * nums[1])
    numDen.append(nums[1] * nums[3])
    return numDen


def subt(nums, op):
    numDen = []
    numDen.append(nums[0] * nums[3] - nums[2] * nums[1])
    numDen.append(nums[1] * nums[3])
    return numDen


def mult(nums, op):
    numDen = []
    numDen.append(nums[0] * nums[2])
    numDen.append(nums[1] * nums[3])
    return numDen


def divi(nums, op):
    numDen = []
    numDen.append(nums[0] * nums[3])
    numDen.append(nums[2] * nums[1])
    return numDen

# entrada
n = int(input())
while(n > 0):
    expressao = str(input()).split(" ")

# processamento
    operacao = expressao[3]
    nums = tratamento(expressao)
    result = str()

    if operacao == '+':
        result = soma(nums, operacao)
    elif operacao == '-':
        result = subt(nums, operacao)
    elif operacao == '*':
        result = mult(nums, operacao)
    else:
        result = divi(nums, operacao) 

    simplificado = simplificacao(result[0], result[1])

    n -= 1

    #saida
    print('{}/{} = {}/{}'.format(result[0], result[1], simplificado[0], simplificado[1]))
