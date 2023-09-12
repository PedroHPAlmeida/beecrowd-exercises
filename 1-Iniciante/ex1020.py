#entrada
dias = int(input())

#processamento
anos = dias // 365
meses = (dias - anos * 365) // 30
dias = dias - (anos * 365 + meses * 30)

print("{:.0f} ano(s)".format(anos))
print("{:.0f} mes(es)".format(meses))
print("{:.0f} dia(s)".format(dias))
