"""
4.	Idatzi Python programa bat zenbaki zerrenda bateko zenbaki bikoitiak eta bakoitiak kontatuko dituena.
Zenbakien adibidea : zerrenda = (1, 2, 3, 4, 5, 6, 7, 8, 9)
Espero den irteera :
Zenbaki bikoiti kopurua : 5
Zenbaki bakoiti kopurua : 4
"""

zerrenda = [1, 2, 2, 4, 2, 6, 7, 8, 9]
print("Lista de numeros: " + str(zerrenda))
cantPares = 0
cantImpares = 0
for i in (zerrenda):
    if i % 2 == 0:
        cantPares += 1
    else:
        cantImpares += 1
print("\nCantidad de numeros PARES: " + str(cantPares))
print("Cantidad de numeros IMPARES: " + str(cantImpares))