#entrada
hInicio, mInicio, hFim, mFim = str(input()).split()
hInicio = int(hInicio)
mInicio = int(mInicio)
hFim = int(hFim)
mFim = int(mFim)

ini = hInicio * 60 + mInicio
fim = hFim * 60 + mFim

#processamento
if ini < fim:
    hTempo = (fim - ini) // 60
    mTempo = (fim - ini) % 60
else:
    hTempo = ((1440 - ini) + fim) // 60
    mTempo = ((1440 - ini) + fim) % 60

#saída
print(f'O JOGO DUROU {hTempo} HORA(S) E {mTempo} MINUTO(S)')
