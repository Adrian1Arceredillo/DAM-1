

def laukizuzenaSortu():
    anchuraRec = int(input("Sartu zabalera: "))
    alturaRec = int(input("Sartu altuera: "))
    for row in range(alturaRec):
        for col in range(anchuraRec):
            print('x', end=" ")
        print()


def erronboaSortu():
    zabaler = int(input("Sartu altuera: "))

    for i in range(zabaler):
        print(" " * (zabaler - i) + " *" * (i + 1))
    for j in range(zabaler - 1):
        print(" " * (j + 2) + " *" * (zabaler - 1 - j))


def triangeluaSortu2():
    triangeluMota = int(input("Aukeratu triangeluaren norantza: "
                              "\n1 = Behera"
                              "\n2 = Gora\n"))
    zabalera = int(input("Sartu triangeluaren zabalera: "))

    if triangeluMota == 1:
        lerroa = zabalera
        for row in range(zabalera):
            for col in range(lerroa):
                print("* ", end=" ")
            lerroa = lerroa - 1

            print()

    elif (triangeluMota == 2):

        for row in range(zabalera):
            for col in range(row + 1):
                print("* ", end=" ")
            print()



#def triangeluaSortu(zabalera, altuera):



if __name__  == "__main__": #esto se pone para que, lo que NO son funciones, solo se ejecute cuando se ejecute/lance este archivo/fichero
                            #con esto evitamos que, si llamamos desde otro archivo, a un función de este, se ejecute lo que sería el "main"

    print()
    print("LAUKIZUZENA: ")

    laukizuzenaSortu()
    print('--------------')

    print("ERRONBOA: ")

    erronboaSortu()
    triangeluaSortu2()
    print('--------------')



#https://techpluslifestyle.com/technology/draw-square-shape-in-python/
#git --global user.name "usergithub"
#git --global user.mail "mail"