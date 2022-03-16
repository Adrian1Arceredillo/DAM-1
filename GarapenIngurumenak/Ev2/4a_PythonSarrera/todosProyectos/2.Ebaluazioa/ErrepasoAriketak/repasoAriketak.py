
#ejercicio1
#https://www.lawebdelprogramador.com/codigo/Python/3053-Calcular-los-multiplos-de-3-y-5.html
import random
from datetime import datetime, date


#ariketa 1
def multiplos5y7():
    zenbakia1 = 1500
    zenbakia2 = 2700

    for i in range(zenbakia1, zenbakia2):
        if (i % 5 == 0) & (i % 7 == 0):
            print(i)


#ariketa 2
def cambioCelsiusFahrenheit():  #c = (f - 32) * (5 / 9)     #f = (9/5 * c) + 32
    print("1- C to F ")
    print("2- F to C:")
    aukera = int(input("Zer egin nahi duzu) (1 edo 2) "))

    if aukera == 1:
        celsiusEntrada = int(input("Sartu C ren balio bat: "))
        f = (9/5 * celsiusEntrada) + 32
        print(f)
    elif aukera == 2:
        fahrenheitEntrada = int(input("Sartu F ren balio bat: "))
        c = (fahrenheitEntrada - 32) * (5 / 9)
        print(c)



#ariketa 3
numeroFilas = 5;
numeroCols = 5
def dibujarFigura():    #https://www.tutorialgateway.org/python-program-to-print-half-diamond-star-pattern/
    for row in range(numeroFilas):
        for col in range(0, row + 1):
            print("* ", end=" ")
        print()
    for row in range(1, numeroFilas):
        for col in range(row, numeroFilas):
            print("* ", end=" ")
        print()


#ariketa 4
def paresEImparesDeUnaLista():
    zerrenda = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    bakoitiak = []
    bikoitiak = []

    for i in zerrenda:
        if (i % 2 == 0):
            bikoitiak.append(i)
        elif (i % 2 != 0):
            bakoitiak.append(i)

    print(bakoitiak)
    print(bikoitiak)


#ejercicio 5
def cambiarIteracionesCondiones():
    for i in range(0, 51):

        if (i % 3 == 0) & (i % 5 == 0):
            print("fizzbuzz")
        elif (i % 3 == 0):
            print("fizz")
        elif (i % 5 == 0):
            print("buzz")
        else:
            print(i)

#ejercicio 6
def contarLetrasNumerosDeString():
    letras = 0
    numeros = 0

    stringAdrian = "Python 3.2"
    print(stringAdrian)
    for i in stringAdrian:
        if (i.isalpha()):
            letras += 1
        elif (i.isdigit()):
            numeros += 1

    print()
    print("String: " + str(stringAdrian))
    print("\tLetras: " + str(letras))
    print("\tNumeros: " + str(numeros))


#ejercicio 7
def patronDibujarLetraA():  #partir de un cuadrado y dibujar en función de las posiciones de los asteriscos
    for i in range(0, 7):
            #for....
        if i == 0:
            print(" *** ")
        elif (i == 3):
            print("*****")
        else:
            print("*   *")

#ejercicio 7 - de otra forma
def dibujarLetraA2():
    zabalera = 5
    altuera = 7
    for y in range(altuera):
        for x in range(zabalera):
            if (y == 1 or y == 2 or y == 4 or y == 5 or y == 6) and (x == 0 or x == 4):
                print("*", end="")
            elif (y == 3):
                print("*", end="")
            elif (y == 0) and (x==1 or x==2 or x==3):
                print("*", end="")
            else:
                print(" ", end="")

        print()




#ejercicio 8
def letraVocalOConsonante():
    sarturikoLetra = input("Idatzi alfabetoko letra bat: ").lower()

    if (sarturikoLetra == 'a' or sarturikoLetra == 'e' or sarturikoLetra == 'i' or sarturikoLetra == 'o' or sarturikoLetra == 'u'):
        print("Sarturiko " + str(sarturikoLetra) + " letra BOCALA da. ")
    else:
        print("Sarturiko " + str(sarturikoLetra) + " letra KONTSONANTEA da. ")


#ejercicio 9
def mesDiaPerteneceAEstacion():
    hilabeteGuztiak = (
    'Urtarrila', 'Otsaila', 'Martxoa', 'Apirila', 'Maiatza', 'Ekaina', 'Uztaila', 'Abuztua', 'Iraila', 'Urria', 'Azaroa',
    'Abendua');

    # print(hilabeteGuztiak.indexof("Urtarrila"))

    stringMes = input("Sartu hilabete baten izena (urtarrila, otsaila...): ").capitalize()
    diaMes = int(input("Sartu hilabetearen egun bat: "))

    numeroMes = hilabeteGuztiak.index(stringMes)
    print(numeroMes + 1)


#ejercicio 9
def fechaDecirEstacion():
    hilabeteGuztiak = (
        'Urtarrila', 'Otsaila', 'Martxoa', 'Apirila', 'Maiatza', 'Ekaina', 'Uztaila', 'Abuztua', 'Iraila', 'Urria',
        'Azaroa',
        'Abendua');

    stringMes = input("Sartu hilabete baten izena (urtarrila, otsaila...): ").capitalize()
    diaMes = int(input("Sartu hilabetearen egun bat: "))

    numeroMes = hilabeteGuztiak.index(stringMes)

    # p.e.: año = 2020 - ya que al usuario no se le pide el valor del año
    randomUrtea = random.randint(2000, 2040)  # obtener un valor aleatorio para la variable correspondiente al año (estará entre 2000-2040)
    print(randomUrtea)
    fechaUsuario = date(randomUrtea, numeroMes + 1, diaMes)


    actualFecha = date.today()  #fecha de hoy

    inicioPrimavera = date(randomUrtea, 3, 20)
    finalPrimavera = date(randomUrtea, 6, 21)
    print(finalPrimavera)

    inicioVerano = date(randomUrtea, 6, 21)
    finalVerano = date(randomUrtea, 9, 23)

    inicioOtoño = date(randomUrtea, 9, 23)
    finalOtoño = date(randomUrtea, 12, 21)

    # dividir el invierno en 2; desde que empieza hasta el final del año, y desde el inicio de año hasta que el invierno acabe
    inicioInviernoParte1 = date(randomUrtea, 12, 21)
    finalInviernoParte1 = date(randomUrtea, 12, 31)

    inicioInviernoParte2 = date(randomUrtea, 1, 1)
    finalInviernoParte2 = date(randomUrtea + 1, 3, 20)


    print("Fecha del usuario: " + str(fechaUsuario))

    if (fechaUsuario >= inicioPrimavera and fechaUsuario < finalPrimavera):
        print("Es Primavera. ")
    elif (fechaUsuario >= inicioVerano and fechaUsuario < finalVerano):
        print("Es Verano. ")
    elif (fechaUsuario >= inicioOtoño and fechaUsuario < finalOtoño):
        print("Es Otoño. ")
    elif ((fechaUsuario >= inicioInviernoParte1 and fechaUsuario <= finalInviernoParte1) or
          (fechaUsuario >= inicioInviernoParte2 and fechaUsuario <= finalInviernoParte2)):
        print("Es Invierno. ")


#ejercicio 10
def tablaDeMultiplicar():
    zenbakia = int(input("Sartu zenbaki bat (1-10): "))

    for i in range (1, 11):
        print(str(zenbakia) + " x " + str(i) + " = " + str(zenbakia * i))





#ejercicio 11
def trianguloConNumeros():

    numeroFilas = 9
    for row in range(numeroFilas):
        for col in range(0, row + 1):
            print(row + 1, end=" ")
        print()


#ejercicio12
def adivinarNumeroOculto():

    #print(random.randint(0, 9))

    numeroSecreto = random.randint(0, 9)
    zenbakiaUser = 30

    while zenbakiaUser != numeroSecreto:
        zenbakiaUser = int(input("Sartu 1-9 ren artean dagoen zenbaki bat: "))

    print("Numero del Programa: " + str(numeroSecreto))
    print("Numero del Usuario: " + str(zenbakiaUser))


#ejercicio 13
def darLaVueltaString():
    hitzaUser = input("Sartu hitz bat: ")

    print(hitzaUser[::-1])

#ejrcicio 13 - aitzol
def esaldiaAlderantziz():
    esaldia = input("Sartu hitz/esaldi bat: ")
    for i in range(len(esaldia)-1, -1, -1):
        print(esaldia[i], end="")

#ejercicio 13 - irati - 1
def reverseStringIrati1():
    esaldiaUser = input("Sartu hitz/esaldi bat: ")
    for i in range(len(esaldiaUser)):
        print(esaldiaUser[len(esaldiaUser) - i - 1], end="")

#ejercicio 13 - irati - 2
def reverseStringIrati2():
    esaldiaUser = input("Sartu hitz/esaldi bat: ")
    for i in reversed (esaldiaUser):
        print(i, end="")


#ejercicio 14
def numerosConTodosLosDigitosImpares():
    num1 = 100
    num2 = 400

    fullImpar = False

    for i in range(num1, num2):
        for x in str(i):
            if int(x) % 2 != 0:
                fullImpar = True
            else:
                fullImpar = False
                break;
        if (fullImpar) == True:
            print(i)


#ejercicio 15
def mediaDe3Numeros():
    num1 = random.randint(0, 10)
    num2 = random.randint(0, 10)
    num3 = random.randint(0, 10)

    print("Numero 1: " + str(num1))
    print("Numero 2: " + str(num2))
    print("Numero 3: " + str(num3))

    sumaTodos = num1 + num2 + num3;
    mediaNumeros = sumaTodos / 3;

    print("La media es: " + str(mediaNumeros))


#ejercicio 16
def sumaTodosLosElementosLista():
    listaNumeros = [3, 4, 2, 11];
    print(listaNumeros)
    sumaTodo = 0

    for i in (listaNumeros):
        sumaTodo += i
    print("La suma total es: " + str(sumaTodo))


#ejercicio 17
def multiplicarElementosLista():
    zenbakienZerrenda = [2, 2, 3, 4]
    print(zenbakienZerrenda)
    multiplicarTodo = 1
    #multiplicarTodo = zenbakienZerrenda[0]

    for i in (zenbakienZerrenda):
        multiplicarTodo = multiplicarTodo * i
    print("El resultado es: " + str(multiplicarTodo))


#ejercicio 18
def mayorElementoLista():

    listaDeNumeros = [2, 4, 56, 55]
    print(listaDeNumeros)

    handiena = max(listaDeNumeros)
    print("El mayor numero de la lista es: " + str(handiena))


#ejercicio 19
def menorElementoLista():
    listaDeNumeros = [2, 4, 56, 55]
    print(listaDeNumeros)

    txikiena = min(listaDeNumeros)
    print("El menor numero de la lista es: " + str(txikiena))


#ejercicio 20 - si X elemento de una lista está en otra lista, se copiará; si ya está, querrá decir que está repetido
def borrarElementosRepetidosLista():
    listaInicial = ["adrian", "luis", "adrian", "pedro"]
    listaFinal = []

    print("Lista CON duplicados: " + str(listaInicial))

    for elemento in listaInicial:
        if elemento not in listaFinal:
            listaFinal.append(elemento)
    print(listaFinal)

#ejercicio 20 - utilizando la función set()
def eliminarDuplicadosLista():
    listaOriginal = ["apple", "bannana", "cherry", "bannana", "bannana"]
    print("Lista original: " + str(listaOriginal))

    listaFiltrada = list(set(listaOriginal))
    print("Lista sin elementos duplicados: " + str(listaFiltrada))


#ejercicio 21
def comprobarSiListaVacia():
    listaComprobar = [3, "tres", 33, 'a']
    estaVacia = True

    print("\nLista: " + str(listaComprobar))
    listarenTamaina = len(listaComprobar)

    if listarenTamaina > 0:
        estaVacia = False

    if estaVacia == True:
        print("\nLa lista ESTÁ VACÍA. ")
        print("Tamaño lista: " + str(listarenTamaina))
    else:
        print("\nLa lista NO está vacía. ")
        print("Tamaño lista: " + str(listarenTamaina))


#ejercicio 22
def clonarLista():
    lista1 = ["adrian", "lorena", 1, 2, "dos"]
    listaCopia = lista1.copy()

    print("Lista original: " + str(lista1))
    print("Clon de la lista: " + str(listaCopia))


#ejercicio 23
def sartuIndexLortuElementua(): #https://www.programiz.com/python-programming/methods/list/index
    listaAdri = ["buenos", "dias", 5, "como", "estas", "hoy", "?"]
    print("\n" + str(listaAdri))

    zenbakiaUser = int(input("\nSartu zenbaki bat: "))

    dagokionElementua = listaAdri[zenbakiaUser - 1]
    print("Zerrendaren " + str(zenbakiaUser) + "-garren posizioan, " + "'" + str(dagokionElementua) + "' elementua dago. ")


#ejercicio 24
def obtenerIndexDeUnElemento():
    listaAdri = ["1", "nombre", "apellido", "2", 'a']
    print("\nLista: " + str(listaAdri))

    elementuaUser = input("\nIdatzi zerrendako elementu bat: ")

    indexElementua = listaAdri.index(elementuaUser)
    print("\nSarturiko " + "'" + str(elementuaUser) + "'" +  " zerrendako " + str(indexElementua + 1) + " posizioan dago. ")


#ejercicio 25
def imprimirRandomIndexLista():
    listaAdri = [1, "FC", 0, "Barcelona", 7, "gol"]
    print("\nLista: " + str(listaAdri))

    randomIndex = random.randint(1, len(listaAdri))
    print("\nNumero random: " + str(randomIndex))

    zerrendakoElementua = listaAdri[randomIndex - 1]
    print("Posizio horretan " + "(" + str(randomIndex) + ")" + " dagoen elementua " + "'" + str(zerrendakoElementua) + "'" + " da. ")


#ejercicio 26
def imprimir3ValoresMasPequeñosLista():
    listaAdri = [16, 4, 9, 1, 3, 20, 8]
    print("\nLista inicial: " + str(listaAdri))

    listaAdri.sort()
    print("Lista ordenada: " + str(listaAdri))

    print("\nHiru zenbaki txikienak: " + str(listaAdri[0:3]))


#prueba recorrer dígitos de un número
def recorrerNumero():
    numeroPrueba = 511
    fullImpar = False
    for x in str(numeroPrueba):
        if int(x) % 2 != 0:
            fullImpar = True
        else:
            fullImpar = False
            break;

    if fullImpar == True:
        print("El numero es full impar")
    else:
        print("No es del todo impar ")


#############################################
#recorrerNumero()   #prueba - recorrer digitos de un numero / caracteres de un string

#multiplos5y7() #ejercicio 1
#cambioCelsiusFahrenheit() #ejercicio 2
dibujarFigura()    #ejercicio 3
#paresEImparesDeUnaLista()   #ejercicio 4
#cambiarIteracionesCondiones() #ejercicio 5
#contarLetrasNumerosDeString() #ejercicio 6
#patronDibujarLetraA()   #ejercicio 7
#dibujarLetraA2()    #ejercicio 7 - de otra forma
#letraVocalOConsonante() #ejercicio 8
#fechaDecirEstacion() #ejercicio 9
#tablaDeMultiplicar()   #ejercicio 10
#trianguloConNumeros()  #ejercicio 11
#adivinarNumeroOculto() #ejercicio 12

#darLaVueltaString()    #ejercicio 13
#esaldiaAlderantziz()    #ejercicio 13 - aitzol
#reverseStringIrati1()     #ejercicio 13 - irati 1
reverseStringIrati2()   #ejercicio 13 - irati 2

#numerosConTodosLosDigitosImpares()  #ejercicio 14 - Galdetu

#mediaDe3Numeros()   #ejercicio 15
#sumaTodosLosElementosLista()    #ejercicio 16
#multiplicarElementosLista()     #ejercicio 17
#mayorElementoLista()   #ejercicio 18
#menorElementoLista()   #ejercicio 19

#borrarElementosRepetidosLista() #ejercicio 20      - comparando elementos en dos listas
#eliminarDuplicadosLista() #ejercicio 20            - usando la función set()
#comprobarSiListaVacia() #ejercicio 21
#clonarLista() #ejercicio 22
#sartuIndexLortuElementua() #ejercicio 23
#obtenerIndexDeUnElemento()  #ejercicio 24
#imprimirRandomIndexLista()  #ejercicio 25
#imprimir3ValoresMasPequeñosLista()  #ejercicio 26
#https://python-para-impacientes.blogspot.com/2014/02/operaciones-con-fechas-y-horas.html