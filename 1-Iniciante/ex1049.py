vertebrado = {'ave': {'carnivoro': 'aguia','onivoro': 'pomba'}, 'mamifero': {'onivoro': 'homem', 'herbivoro': 'vaca'}}
invertebrado = {'inseto': {'hematofago': 'pulga','herbivoro': 'lagarta'}, 'anelideo': {'hematofago': 'sanguessuga', 'onivoro': 'minhoca'}}

#entrada
palavra1 = str(input()).strip().lower() 
palavra2 = str(input()).strip().lower() 
palavra3 = str(input()).strip().lower() 

#processamento
if palavra1 == 'vertebrado':
    print(f"{vertebrado[palavra2][palavra3]}")
else:
    print(f"{invertebrado[palavra2][palavra3]}")
