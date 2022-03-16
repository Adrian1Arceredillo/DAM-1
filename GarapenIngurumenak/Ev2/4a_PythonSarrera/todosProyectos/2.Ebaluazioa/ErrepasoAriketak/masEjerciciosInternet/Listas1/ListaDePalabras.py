"""
Listas (1) - 2
Escriba un programa que permita crear una lista de palabras y que,
a continuación, pida una palabra y diga cuántas veces aparece esa
palabra en la lista.

Es decir, especificar el número de palabras que queremos, y además
ir añadiendo dichas palabras.

"""

def crearListaPalabras():

    listaPalabras = []
    cantidadPalabras = int(input("Cuántas palabras tiene la lista? "))

    if (cantidadPalabras < 1):
        print("¡Imposible! ")
    else:
        for i in range(cantidadPalabras):
            palabraUser = input("Cuál es la palabra " + str(i + 1) + "? ")
            listaPalabras.append(palabraUser)
        print("La lista creada es: " + str(listaPalabras))
        print(listaPalabras[1])


if __name__=="__main__":    #ejecutar
    crearListaPalabras()