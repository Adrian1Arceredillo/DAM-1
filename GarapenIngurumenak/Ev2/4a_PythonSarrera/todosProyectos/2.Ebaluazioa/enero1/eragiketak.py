#pasar un número y obtener el factorial correspondiente
#pasar lista de números y obtener el menor de ellos


numerosLista = [12, 7, 8, 55, 22];

def zenbFaktoriala(n):  #calcular e imprimir el factorial del número introducido
    faktoriala_emaitza = 1
    while n > 1:
        faktoriala_emaitza = faktoriala_emaitza * n
        n -= 1
    return faktoriala_emaitza


def menorDeLaLista(dagokionLista):
    for txikiena in dagokionLista:
        txikiena = min(dagokionLista)
    return txikiena

def imprimirResultados(numeroCalcularFactorial):
    print('Emaitza 1: Zenbakiaren faktoriala ' +
          str(zenbFaktoriala(numeroCalcularFactorial)) + ' da. ' +
          '\nEmaitza 2: Listaren datu txikiena ' +
          str(menorDeLaLista(numerosLista)) + ' da. ')



if __name__  == "__main__": #esto se pone para que, lo que NO son funciones, solo se ejecute cuando se ejecute/lance este archivo/fichero
                            #con esto evitamos que, si llamamos desde otro archivo, a un función de este, se ejecute lo que sería el "main"


    numeroEntrada = int(input('\nSartu zenbaki bat (oso altua EZ dena): '))
    print('--------------')

    imprimirResultados(numeroEntrada)

#factorial de un número (mediante input)
#print('\nEmaitza 1: Zenbakiaren faktoriala ' + str(zenbFaktoriala(numeroEntrada)) + ' da. ')

#obtener el menor valor/número de una lista existente
#print('Emaitza 2: Listaren/zerrendaren balio txikiena ' + str(menorDeLaLista(numerosLista)) + ' da. ')

