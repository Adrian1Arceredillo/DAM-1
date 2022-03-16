"""
Listas (1) - 2
Escriba un programa que permita crear una lista de palabras y que,
a continuación, pida una palabra y diga cuántas veces aparece esa
palabra en la lista.

Hay que crear una lista, pedir una palabra de la lista al usuario,
y CONTAR cuántas veces aparece esa palabra en la lista.

"""


def contarPalabraEnLista():
    listaPalabras = []
    cantidadPalabras = int(input("Cuántas palabras tiene la lista? "))
    cantMismaPalabra = 0

    if (cantidadPalabras < 1):
        print("¡Imposible! ")
    else:
        for i in range(cantidadPalabras):
            palabraUser = input("Cuál es la palabra " + str(i + 1) + "? ")
            listaPalabras.append(palabraUser)
        print("La lista creada es: " + str(listaPalabras))

    palabraDeseada = input("\nQué palabra quieres buscar? ")
    for elemento in listaPalabras:
        if elemento == palabraDeseada:
            cantMismaPalabra += 1

    if (cantMismaPalabra == 0):
        print("\nLa palabra" + "'" + str(palabraDeseada) + "'" + " NO aparece en la lista. ")
    else:
        print("\nLa palabra " + "'" + str(palabraDeseada) + "'" + " se aparece " + str(cantMismaPalabra) + " veces. ")


if __name__ == "__main__":  #ejecutar
    contarPalabraEnLista()