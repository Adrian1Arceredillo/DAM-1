"""
Listas (1) - 8
Escriba un programa que permita crear dos listas de palabras y que,
a continuación, escriba las siguientes listas (en las que no debe haber repeticiones):

Lista de palabras que aparecen en las dos listas.
Lista de palabras que aparecen en la primera lista, pero no en la segunda.
Lista de palabras que aparecen en la segunda lista, pero no en la primera.
Lista de palabras que aparecen en ambas listas.
Nota: Para evitar las repeticiones, el programa deberá empezar eliminando los elementos repetidos en cada lista.
"""

primeraLista = []
tamañoLista1 = int(input("\nCuántas palabras tiene la PRIMERA lista? "))

for i in range(tamañoLista1):
    palabrasLista1 = input("Cuál es la palabra " + str(i + 1) + "? ")
    primeraLista.append(palabrasLista1)

listaSinRepetidos1 = []
for i in primeraLista:
    if i not in listaSinRepetidos1:
        listaSinRepetidos1.append(i)

segundaLista = []
tamañoLista2 = int(input("\nCuántas palabras tiene la SEGUNDA lista? "))

for i in range(tamañoLista2):
    palabrasLista2 = input("Cuál es la palabra " + str(i + 1) + "? ")
    segundaLista.append(palabrasLista2)

listaSinRepetidos2 = []
for i in segundaLista:
    if i not in listaSinRepetidos2:
        listaSinRepetidos2.append(i)

print("\nLista 1: " + str(listaSinRepetidos1))
print("Lista 2: " + str(listaSinRepetidos2))


def palabrasEnLasDosListas():
    palabrasComunes = []
    for i in listaSinRepetidos1:
        if i in listaSinRepetidos2:
            palabrasComunes.append(i)
    print("\nPalabras comunes: " + str(palabrasComunes))


def palabrasSoloEnLaPrimera():
    enLaPrimera = []
    for i in listaSinRepetidos1:
        if i not in listaSinRepetidos2:
            enLaPrimera.append(i)
    print("Solo en la PRIMERA lista: " + str(enLaPrimera))


def palabrasSoloEnLaSegunda():
    enLaSegunda = []
    for i in listaSinRepetidos2:
        if i not in listaSinRepetidos1:
            enLaSegunda.append(i)
    print("Solo en la Segunda lista: " + str(enLaSegunda))

def palabrasTodasLasListasSinRepetir(): #todas las palabras que aparecen en las listas (si una está en las dos, se mostrará UNA vez)
    todasLasPalabrasConRepetidos = []
    for i in listaSinRepetidos1:
        if i not in todasLasPalabrasConRepetidos:
            todasLasPalabrasConRepetidos.append(i)

    for j in listaSinRepetidos2:
        if j not in todasLasPalabrasConRepetidos:
            todasLasPalabrasConRepetidos.append(j)

    todasLasPalabrasSinDuplicados = []
    for x in todasLasPalabrasConRepetidos:
        if x not in todasLasPalabrasSinDuplicados:
            todasLasPalabrasSinDuplicados.append(x)

    print("Todas las palabras: " + str(todasLasPalabrasSinDuplicados))

if __name__=="__main__":
    palabrasEnLasDosListas()    #palabras que aparecen en las dos listas
    palabrasSoloEnLaPrimera()   #palabras que solo aparecen en la PRIMERA lista
    palabrasSoloEnLaSegunda()   #palabras que solo aparecen en la SEGUNDA lista
    palabrasTodasLasListasSinRepetir()  #todas las palabras de las DOS listas, sin repetidos