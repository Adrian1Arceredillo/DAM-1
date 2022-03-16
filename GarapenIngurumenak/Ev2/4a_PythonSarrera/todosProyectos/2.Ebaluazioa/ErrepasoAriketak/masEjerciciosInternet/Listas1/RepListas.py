"""
Ejercicio 1
Escriba un programa que permita crear una lista de palabras y que,
a continuación, pida una palabra y diga cuántas veces aparece esa
palabra en la lista.

Hay que crear una lista, pedir una palabra de la lista al usuario,
y CONTAR cuántas veces aparece esa palabra en la lista.
"""

listaPalabras = []
cantPalabras = int(input("\nCuántas palabras tendrá la lista? "))
cantMismaPalabra = 0

for i in range(cantPalabras):
    cadaPalabra = input("Introduce la palabra número " + str(i + 1) + ": ")
    listaPalabras.append(cadaPalabra)
print("\nLista de palabras: " + str(listaPalabras))

alReves = []

for i in reversed(listaPalabras):
    alReves.append(i)

print("\nLista al revés: " + str(alReves))


