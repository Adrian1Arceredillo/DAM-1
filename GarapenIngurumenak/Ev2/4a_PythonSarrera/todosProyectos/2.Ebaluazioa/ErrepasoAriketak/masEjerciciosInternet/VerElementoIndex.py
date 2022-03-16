"""
- Especificar el índex deseado del String, y devolver el elemento de dicho índex
- Pasarle un carácter/elemento del String, y que el programa nos diga en qué posición está (índex)
"""

def decirIndexVerElemento():
    hitza = "abcde"
    #indexString = int(input("Sartu hizkiaren posizioa: "))
    indexDeseado = 4
    print("\nPalabra: " + str(hitza))
    print("El carácter en la posición " + str(indexDeseado) + " es: " + str(hitza[indexDeseado - 1]))


def decirElementoVerIndex():
    hitza = "abcdefg"
    print("\nPalabra: " + str(hitza))
    caracterUser = input("Sartu hitzaren hizki bat: ")
    print("El índex del carácter " + str(caracterUser) + " es: " + str(hitza.index(caracterUser) + 1))


if __name__=="__main__":
    decirIndexVerElemento()
    decirElementoVerIndex()

#otro posible ejercicio -> print(s[0:3])   #imprimir los carácteres del 0 al 3 del string s