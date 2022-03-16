"""
Listas (1) - 3
Escriba un programa que permita crear una lista de palabras y que,
a continuación, pida dos palabras y sustituya la primera por la
segunda en la lista.

"""


def sustituirElementoLista():
    listaPalabras = []
    cantidadPalabras = int(input("Cuántas palabras tiene la lista? "))

    if (cantidadPalabras < 1):
        print("¡Imposible! ")
    else:
        for i in range(cantidadPalabras):
            palabraUser = input("Cuál es la palabra " + str(i + 1) + "? ")
            listaPalabras.append(palabraUser)
        print("La lista creada es: " + str(listaPalabras))

    palabraVieja = input("\nQué palabra quieres sustituir? ").lower()
    palabraNueva = input("Nueva palabra: ")

    for x in range(len(listaPalabras)):
        if listaPalabras[x].lower() == palabraVieja:
            listaPalabras[x] = palabraNueva
    print("\nLista cambiada: " + str(listaPalabras))

if __name__=="__main__":
    sustituirElementoLista()