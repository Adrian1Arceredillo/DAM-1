"""
Listas (1) - 6
Escriba un programa que permita crear una lista de palabras y que,
a continuación, cree una segunda lista igual a la primera, pero al
revés (no se trata de escribir la lista al revés, sino de crear una lista distinta).
"""

def ponerListaAlReves():
    listaOriginal = []
    tamañoLista = int(input("\nCuántas palabras tiene la lista? "))

    for i in range(tamañoLista):
        contenidoLista = input("Cuál es la palabra " + str(i + 1) + "? ")
        listaOriginal.append(contenidoLista)

    listaAlReves = []
    for x in reversed(listaOriginal):
        listaAlReves.append(x)
    print("La lista al revés es: " + str(listaAlReves))


if __name__=="__main__":
    ponerListaAlReves()