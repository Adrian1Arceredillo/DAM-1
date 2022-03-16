"""
20.	Idatzi zerrenda batean errepikatuta dauden zenbakiak ezabatuko dituen programa bat.
"""

listaInicial = ["adrian", "luis", "adrian", "pedro"]

listaSinRepetidos = []

for i in range(len(listaInicial)):
    if listaInicial[i] not in listaSinRepetidos:
        listaSinRepetidos.append(listaInicial[i])

print("\nLista inicial: " + str(listaInicial))
print("Lista final: " + str(listaSinRepetidos))

"""
listaInicial = list(set(listaInicial))
print("Lista FILTRADA: " + str(listaInicial))
"""