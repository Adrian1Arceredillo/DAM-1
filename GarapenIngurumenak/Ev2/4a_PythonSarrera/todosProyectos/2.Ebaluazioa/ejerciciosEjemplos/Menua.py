#crear un menú que contenga múltiples opciones

#a) capitalize() -> poner en mayúscula la primera letra de un string
#b) find() -> buscar un texto dentro de otro
#c) count() -> contar cuántas veces aparece un texto dentro de otro
#d) isalpha() -> comprobar si una cadena tiene solamente letras
#e) len() -> longitud de una cadena


cadena = input('Introduce una cadena de texto: ')
print(cadena + '\n')

print('MENUA')
print('-----------')

aukera = "afwff"
salir = False

while(aukera != 'f'):

    print('a) Introducir un string y poner el primer carácter en mayúsculas ')
    print('b) En un determinado texto, buscar un texto específico ')
    print('c) Contar cuántas veces aparece un texto dentro de otro')
    print('d) Comprobar si una cadena tiene solamente letras')
    print('e) Obtener la longitud de una cadena')
    print('f) Salir')

    aukera = input('Elige una opción: ')

    if (aukera == 'a'):
        cadenaA1 = input('Introduce una cadena: ')
        cadenaMayus = cadenaA1.capitalize()
        print('-----------')
        print(cadenaMayus)
        print()

    elif (aukera == 'b'):
         cadenaB1 = input('Introduce una cadena: ')
         cadenaB2 = input('Introduce la cadena que quieres buscar: ')
         print('-----------')
         print (cadenaB1.find(cadenaB2))
         print()

    elif (aukera == 'c'):
        cadenaC1 = input('Introduce un texto: ')
        cadenaC2 = input('¿Que texto quieres BUSCAR y CONTAR? ')
        print('La letra ' + str(cadenaC2) + ' se repite ' + str(cadenaC1.count(cadenaC2)) + ' veces. ')
        print()

    elif(aukera == 'd'):    #si hay espacios, detecta que NO son solamente letras
        cadenaD1 = input('Introduce una cadena: ')
        print(cadenaD1.isalpha())
        print()

    elif(aukera == 'e'):
        cadenaE1 = input('Introduce una cadena: ')
        print(len(cadenaE1))
        print()

    elif(aukera == 'f'):
        salir = True

    else:
        print('No se ha encontrado la opcion. ')
        print()

print('FIN. ')














