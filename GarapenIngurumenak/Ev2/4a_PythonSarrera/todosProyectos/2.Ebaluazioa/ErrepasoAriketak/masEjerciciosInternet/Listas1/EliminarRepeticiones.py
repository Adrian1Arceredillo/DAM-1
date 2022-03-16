"""
Listas (1) - 7
Escriba un programa que permita crear una lista de palabras y que,
a continuación, elimine los elementos repetidos (dejando únicamente el primero de los elementos repetidos).
"""

def eliminarRepetidos():
    listaRepetidos = []
    tamañoLista = int(input("\nCuántas palabras tiene la lista? "))

    for i in range(tamañoLista):
        contenidoLista = input("Cuál es la palabra " + str(i + 1) + "? ")
        listaRepetidos.append(contenidoLista)

    listaCorrecta = []
    for i in listaRepetidos:
        if i not in listaCorrecta:
            listaCorrecta.append(i)
    print("Lista sin duplicados: " + str(listaCorrecta))


def borrarRepetidosConSet():    #utilizando el método set()
    listaRepetidos = []
    tamañoLista = int(input("\nCuántas palabras tiene la lista? "))

    for i in range(tamañoLista):
        contenidoLista = input("Cuál es la palabra " + str(i + 1) + "? ")
        listaRepetidos.append(contenidoLista)

    listaSinDuplicados = list(set(listaRepetidos))
    print("Lista sin duplicados: " + str(listaSinDuplicados))



if __name__=="__main__":
    eliminarRepetidos()
    #borrarRepetidosConSet() #utilizando set()