#crear un menú que contenga múltiples opciones

#menu con diferentes opciones
#opciones codificadas en funciones
#trabajará con lists, tuples, date and time...

import datetime
from datetime import date
from datetime import time

print()
print('Contenido inicial:')
listaFrutas = ['fresa', 'cereza', 'platano', 'mandarina'];
print('Frutas -> ' + str(listaFrutas))
tupleBebidas = ('agua', 'vino', 'refresco', 'cerveza');
print('Bebidas -> ' + str(tupleBebidas))
print()
print('-----------')

def añadirFruta(nuevoDato): #función para añadir un nuevo elemento a la lista
    print()
    print('Antes -> ' + str(listaFrutas))
    listaFrutas.append(nuevoDato)
    print('Despues -> ' + str(listaFrutas))

def primeraLetraMayus():   #función para poner en mayúsculas la primera letra de cada elemento de la lista
    print()
    print('Antes -> ' + str(listaFrutas))
    for i, elemento in enumerate(listaFrutas):
        listaFrutas[i] = listaFrutas[i].capitalize()
    print('Despues -> ' + str(listaFrutas))


def listaBerriaDeskontuak(existenteListaFrutas, descuentoFruta):
    print()
    frutaDeskontua = existenteListaFrutas.copy()
    print('Deskontu gabe -> ' + str(frutaDeskontua))
    for i, elemento in enumerate(frutaDeskontua):
        frutaDeskontua[i] = frutaDeskontua[i] + '%' + str(descuentoFruta)
    print('Deskontuarekin -> ' + str(frutaDeskontua))


def elegirBebida(numBebida):    #el input será un numero. Se devolverá el valor del elemento que haya en esa posición de la tupla
    for i in tupleBebidas:
        print()
        print('Aquí tienes tu ' + str(tupleBebidas[numBebida-1]) + ". Gracias. ")
        break


def elegirBebida2(bebidaDeseada):   #el input será el contenido de alguno de los elementos de la tupla
    for i in tupleBebidas:
        if bebidaDeseada in tupleBebidas:
            numbebidaDeseada = tupleBebidas.index(numBebida)   #guardar/encontrar la posición del elemento que coincide con el valor de entrada
            break
    print()
    print('Aquí tienes tu ' + str(tupleBebidas[numbebidaDeseada]) + '. Gracias. ')


def obtenerCantidadBebidas():
    print()
    print('Actualmente, hay un total de ' + str(len(tupleBebidas)) + ' bebidas. ')


def fechaActual():  #devolver la fecha y hora actual; y además, ver el día y el mes en texto (viernes..., marzo...)
    hoyInfoCompleta = datetime.datetime.now()
    print()
    print(hoyInfoCompleta)
    print('\tUrtea: ' + str(hoyInfoCompleta.strftime("%Y")))
    print('\tHilabetea: ' + str(hoyInfoCompleta.strftime("%B")) + ', ' + str(hoyInfoCompleta.strftime("%b")))
    print('\tEguna: ' + str(hoyInfoCompleta.strftime("%A")) + ', ' + str(hoyInfoCompleta.strftime("%a")))
    #IMPORTANTE: ver/sacar apuntes de -> https://www.programiz.com/python-programming/datetime


def fechaCumpleaños(año, mes, dia):
    #https://www.programiz.com/python-programming/datetime
    a = date(año, mes, dia)
    print("Tu cumpleaños: " + str(a))

#tuple: preguntar por un valor, y responder si/no dependiendo si dicho elemento existe en tuple


aukera = "afwff"
salir = False

while(aukera != 'h'):
    print('-----------')
    print('MENUA')
    print('-----------')
    print('a) Fruta bat gehitu. Ikusi listaren aurrekoa/ondorengoa. ')
    print('b) Fruta bakoitzaren lehenengo hizkia, letra larriz jarri. Ikusi listaren aurrekoa/ondorengoa.')
    print('c) Hutsik dagoen lista berri batean, honako hau gorde:' )
    print('\t * Fruten listaren edukia kopiatu')
    print('\t * Sarturiko 0-100 tarteko datua (ehuneko deskontua irudikatzen), listaren\n\t   elementu bakoitzari gehitu (adib: fresa%50). ')
    print('d) Aukeratu tabernan dagoen edari mota bat (sartu izena) ')
    print('e) Zenbat edari dauden tabernan? ')
    print('f) Adierazi gaurko data ')
    print('g) Noiz da zure urtebetetzea? ')
    print('h) Irten ')

    aukera = input('Elige una opción: ')

    if (aukera == 'a'):
        nuevaFruta = input('Introduce una fruta nueva: ')
        añadirFruta(nuevaFruta)
        print('---------------------------------------------------------')
        print()

    elif (aukera == 'b'):
         primeraLetraMayus()
         print('---------------------------------------------------------')
         print()

    elif (aukera == 'c'):
        zenbatekoDeskontua = input('Zenbateko deskontua aplikatuko da? (0-100): ')
        listaBerriaDeskontuak(listaFrutas, zenbatekoDeskontua)
        print('---------------------------------------------------------')
        print()

    elif (aukera == 'd'):    #si hay espacios, detecta que NO son solamente letras
        print()
        print('Bebidas disponibles: ' + str(tupleBebidas))
        numBebida = (input('Qué bebida deseas?: '))
        elegirBebida2(numBebida)
        #numBebida = (input('Que bebida deseas? (numero): '))
        #elegirBebida(numBebida)
        print('---------------------------------------------------------')
        print()

    elif (aukera == 'e'):
        obtenerCantidadBebidas()
        print('---------------------------------------------------------')
        print()

    elif (aukera == 'f'):
        fechaActual()
        print('---------------------------------------------------------')
        print()

    elif (aukera == 'g'):
        añoCumple = int(input('\tAño (yyyy): '))
        mesCumple = int(input('\tMes (mm): '))
        diaCumple = int(input('\tDia (dd): '))
        fechaCumpleaños(añoCumple, mesCumple, diaCumple)
        print('---------------------------------------------------------')
        print()

    elif (aukera == 'h'):
        break

    else:
        print('No se ha encontrado la opcion. ')
        print()

print()
print('FIN. ')














