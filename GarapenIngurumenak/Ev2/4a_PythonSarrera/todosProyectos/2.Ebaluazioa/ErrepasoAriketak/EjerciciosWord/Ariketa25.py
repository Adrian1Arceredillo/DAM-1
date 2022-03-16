"""
25.	Idatzi Python programa bat zerrenda bateko elementu bat ausaz (random) aukeratu eta bistaratuko duena.
"""
import random

zerrenda = ["mesa", 188, "44", "c"]
print("\nLista: " + str(zerrenda))

aleatorio = random.randint(1, len(zerrenda)) - 1

print("\nElemento aleatorio: " + str(zerrenda[aleatorio]))