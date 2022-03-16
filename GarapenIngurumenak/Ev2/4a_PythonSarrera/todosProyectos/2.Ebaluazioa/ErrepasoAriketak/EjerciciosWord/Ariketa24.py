"""
24.	Idatzi Python programa bat zerrenda bateko elementu baten indizea zein den esango duena.
"""

zerrenda = ["mesa", 188, "44", "c"]
print("\nLista: " + str(zerrenda))

elementoUser = input("Sartu elementua: ")

for i in zerrenda:
    if str(i) == elementoUser:
        print("\nEl elemento " + "'" + str(elementoUser) + "' está en la posición: " + str(zerrenda.index(i) + 1))


