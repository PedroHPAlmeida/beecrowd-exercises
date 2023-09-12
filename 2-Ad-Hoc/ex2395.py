#entrada
largCont, compCont, altCont = str(input()).split() #leitura das medidas do conteiner
largCont = int(largCont)
compCont = int(compCont)
altCont = int(altCont)

largNav, compNav, altNav = str(input()).split() #leitura das medidas do navio
largNav = int(largNav)
compNav = int(compNav)
altNav = int(altNav)

#processamento
qntdConteiners = (largNav // largCont) * (compNav // compCont) * (altNav // altCont)

#saida
print(qntdConteiners)
