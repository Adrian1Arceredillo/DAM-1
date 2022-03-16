"""
Tenemos una lista de números:
    - los números no están ordenados
    - ordenar los números en la misma lista (no crear otra lista nueva)
    - no es válido utilizar sort()

    listaDeNumeros = [8, 16, 2, 4, 7]

"""

def ordenarNumerosLista():  #utilizando el método burbuja
    listaDeNumeros = [8, 16, 2, 4, 7]
    print("\nLista inicial: " + str(listaDeNumeros))

    for i in range(1, len(listaDeNumeros)):
        for j in range(0, len(listaDeNumeros) - i):
            if (listaDeNumeros[j + 1] < listaDeNumeros[j]):
                aux = listaDeNumeros[j]
                listaDeNumeros[j] = listaDeNumeros[j + 1]
                listaDeNumeros[j + 1] = aux
    print("Lista ordenada: " + str(listaDeNumeros))

ordenarNumerosLista()   #ejecutar





"""
Más ejercicios (con soluciones):
    Buscar: "mclibre python ejercicios listas"
        - https://www.mclibre.org/consultar/python/ejercicios/ej-listas-1.html
        - https://www.mclibre.org/consultar/python/ejercicios/ej-listas-1-soluciones.html
"""