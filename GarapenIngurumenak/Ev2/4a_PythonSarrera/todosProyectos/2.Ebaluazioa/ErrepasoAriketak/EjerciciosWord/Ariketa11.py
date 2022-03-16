"""
11.	Idatzi Python programa bat habiratutako for bukleen bidez ondorengo patroia bistaratuko duena:

Esperotako irteera:
1
22
333
4444
55555
666666
7777777
88888888
999999999
"""
numeroFilas = 9
for i in range(numeroFilas):
    for j in range(0, i + 1):
        print(i + 1, end=" ")
    print()