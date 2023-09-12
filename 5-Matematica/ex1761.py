from math import tan, radians
#entrada
while True:
   try:
      angulo, distanciaArvore, alturaElfo = str(input()).split()
      angulo = float(angulo)
      distanciaArvore = float(distanciaArvore)
      alturaElfo = float(alturaElfo)

      #processamento
      alturaArvore = tan(radians(angulo)) * distanciaArvore + alturaElfo
      qntdCordao = alturaArvore * 5

      #saida
      print('{:.2f}'.format(qntdCordao))
   except EOFError:
      break
