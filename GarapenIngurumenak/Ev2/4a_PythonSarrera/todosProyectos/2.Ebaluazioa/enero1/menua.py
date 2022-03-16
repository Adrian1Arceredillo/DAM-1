#crear un menú que tenga 4 opciones
#este menú funcionará llamando a las funciones creadas en los archivos "eragiketak" y "egunak"

#para poder llamar a funciones de otro archivo, utilizaremos lo siguiente:

import eragiketak as f1
import egunak as f2
import irudiak as f3

aukera = "proba"


while(aukera != 'h'):
    # menú
    print('\n####Menua####')
    print('a) Eskatu zenbaki bat erabiltzaileari eta horren faktoriala kalkulatu ')
    print('b) Zenbakizko zerrenda baten daturik/baliorik txikiena lortu/bistarazi ')
    print('c) Hilabetearen IZENA bistaratu (sartu 1-12): ')
    print('d) Hilabeteak dituen EGUN kopurua bistaratu (sartu 1-12): ')
    print('e) Laukizuzena marraztu: ')
    print('f) Erronbo bat marraztu: ')
    print('g) Triangelua marraztu: ')
    print('h) Irten ')
    print()

    aukera = input('Zein da zure aukera? (a,b...) ')

    if (aukera == 'a'):
        print()
        zenbFaktorialaUsuario = int(input('Sartu zenbaki bat (oso altua EZ dena): '))
        print('Faktoriala: ' + str(f1.zenbFaktoriala(zenbFaktorialaUsuario)))

        print('---------------------------------------------------------')

    elif (aukera == 'b'):
        print()
        print('Zerrendako balio txikiena ' + str(f1.menorDeLaLista(f1.numerosLista)) + ' da. ')

        print('---------------------------------------------------------')

    elif (aukera == 'c'):
        print()
        numeroMesUsuarioNombre = int(input('Sartu hilabetearen (1-12) zenbakia: '))
        print('Hilabetearen izena ' + str(f2.obtenerNombreMes(numeroMesUsuarioNombre)).capitalize() + ' da. ')

        print('---------------------------------------------------------')

    elif (aukera == 'd'):
        print()
        numeroMesUsuarioDias = int(input('Sartu hilabetearen (1-12) zenbakia: '))
        print(str(f2.obtenerNombreMes(numeroMesUsuarioDias)).capitalize() + '-k ' +
              str(f2.obtenerNumeroDeDiasMes(numeroMesUsuarioDias)) + ' egun ditu. ')

        print('---------------------------------------------------------')

    elif (aukera == 'e'):
        print()
        f3.laukizuzenaSortu()
        print('---------------------------------------------------------')

    elif (aukera == 'f'):
        print()
        f3.erronboaSortu()
        print('---------------------------------------------------------')

    elif (aukera == 'g'):
        print()
        f3.triangeluaSortu2()
        print('---------------------------------------------------------')

    elif (aukera == 'h'):
        break

    else:
        print('No se ha encontrado la opcion. ')
        print()

print()
print('FIN. ')










#aukera = "aafw"






