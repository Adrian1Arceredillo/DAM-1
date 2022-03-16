"""
16.	Idatzi zerrenda bateko elementu guztiak batuko dituen programa bat.
"""

zerrenda = [2, 9, 11, 6, 3]
print("\nLista: " + str(zerrenda))

sumaTodo = 0

for i in range(len(zerrenda)):
    sumaTodo += zerrenda[i]

print("\nSuma: " + str(sumaTodo))