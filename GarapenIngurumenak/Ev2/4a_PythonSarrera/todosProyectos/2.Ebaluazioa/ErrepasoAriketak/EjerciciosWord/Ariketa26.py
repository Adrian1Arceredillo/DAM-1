"""
26.	Idatzi python programa bat zerrenda bateko hiru zenbaki txikienak pantailaratuko dituena (ordenan).
"""

zerrenda= [8, 16, 2, 4, 7]
print("\nLista inicial: " + str(zerrenda))

for i in range(1, len(zerrenda)):
    for j in range(0, len(zerrenda) - i):
        if zerrenda[j + 1] < zerrenda[j]:
            aux = zerrenda[j]
            zerrenda[j] = zerrenda[j + 1]
            zerrenda[j + 1] = aux

print("\nLista ordenada: " + str(zerrenda))
print("\nHiru txikienak: " + str(zerrenda[0:3]))


#print("Primeros 3 elementos: " + str(list(zerrenda[0:3])))