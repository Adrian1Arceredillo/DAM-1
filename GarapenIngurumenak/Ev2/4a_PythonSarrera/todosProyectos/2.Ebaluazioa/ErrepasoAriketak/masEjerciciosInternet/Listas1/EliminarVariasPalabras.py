"""
Listas (1) - 5
Escriba un programa que permita crear dos listas de palabras y que,
a continuación, elimine de la primera lista los nombres de la segunda lista.
"""

def borrarVariasPalabras():
    listaPalabras = []
    cantidadPalabras = int(input("Cuántas palabras tiene la lista? "))

    if (cantidadPalabras < 1):
        print("¡Imposible! ")
    else:
        for i in range(cantidadPalabras):
            palabraUser = input("Cuál es la palabra " + str(i + 1) + "? ")
            listaPalabras.append(palabraUser)
        print("La lista creada es: " + str(listaPalabras))

    listaEliminar = []
    borrarCuantas = int(input("\nCuántas palabras quieres eliminar? "))
    for i in range(borrarCuantas):
        palabraNoDeseada = input("Cuál es la palabra " + str(i + 1) + "? ")
        listaEliminar.append(palabraNoDeseada)
    print("Lista de la palabras a eliminar: " + str(listaEliminar))

    for i in listaEliminar:
        for j in range(len(listaPalabras) - 1, -1, -1):
            if listaPalabras[j] == i:
                del listaPalabras[j]
    print("Lista después de los cambios: " + str(listaPalabras))


if __name__=="__main__":
    borrarVariasPalabras()