"""
Ejercicio 24
"""
zerrenda = ["mesa", 188, "44", "c"]
print("\nLista: " + str(zerrenda))

elementoUser = input("Sartu elementua: ")


for i in zerrenda:
    if str(i) == elementoUser:
        print("\nEl índice del elemento " + str(i) + ", es: " + str(zerrenda.index(i) + 1))


