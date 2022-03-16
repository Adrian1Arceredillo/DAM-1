#introducir un número entre 1-12, y DEVOLVER EL NOMBRE del mes correspondiente
#introducir el número de un mes, y DEVOLVER EL NÚMERO DE DÍAS que tiene dicho mes

hilabeteakIzenak = ('enero', 'febrero', 'marzo', 'abril',
                    'mayo', 'junio', 'julio', 'agosto',
                    'septiembre', 'octubre', 'noviembre', 'diciembre');

hilabeteakEgunak = (31, 28, 31, 30,
                    31, 30, 31, 31,
                    30, 31, 30, 31);

def obtenerNombreMes(n):    #obtener el valor del elemento que se encuentra en la posición deseada/especificada
    return hilabeteakIzenak[n - 1]


def obtenerNumeroDeDiasMes(n):   #obtener el valor del elemento que se encuentra en la posición deseada/especificada
    return hilabeteakEgunak[n - 1]


def mostrarResultadoResumido(entradaUsuario): #imprimir el contenido deseado de la siguiente forma:
    print('Hilabetearen izena ' +
          str(obtenerNombreMes(entradaUsuario)) + ' da, eta ' +
          str(obtenerNumeroDeDiasMes(entradaUsuario)) + ' egun ditu. ')



if __name__  == "__main__": #esto se pone para que, lo que NO son funciones, solo se ejecute cuando se ejecute/lance este archivo/fichero
                            #con esto evitamos que, si llamamos desde otro archivo, a un función de este, se ejecute lo que sería el "main"

    # pedir un número (entre 1-12) al usuario
    numeroDelMesUsuario = int(input('Sartu hilabetearen (1-12) zenbakia: '))

    mostrarResultadoResumido(numeroDelMesUsuario)



