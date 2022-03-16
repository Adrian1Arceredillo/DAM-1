"""
23.	Idatzi Python programa bat zenbaki bat irakurri eta zerrendan posizio
horretan dagoen elementua bistaratuko duena.
"""

zerrenda = ["mesa", 188, "44", "c"]
print("\nLista: " + str(zerrenda))

posicionUser = int(input("Zein elementu nahi duzu ikusi? (sartu posizioa): "))

if posicionUser > len(zerrenda):
    print("\nPosición NO válida. ")
else:
    print("\nEl elemento en la posición " + str(posicionUser) + ", es: " + "'" + str(zerrenda[posicionUser - 1]) + "'. ")