import csv

from csv import reader

with open('textoSinCod.txt', mode='r') as f:   #with oper -> sartu fitxategiaren izena
    lerroak = f.readlines()

def kodifikatu():
    for i in lerroak:
        for j in range(len(i)):
            if i[j] == " ":
                print(" ", end="")
            elif i[j] == "z":
                siguiente = chr(97)
                print(str(siguiente), end="")
            elif i[j] == "Z":
                siguiente = chr(65)
                print(str(siguiente), end="")
            elif i[j] != "z" or i[j] != "Z":
                actualAsci = ord(i[j])
                siguiente = chr(actualAsci + 1)
                print(str(siguiente), end="")
            else:
                print(i[j], end="")
        print()

with open('textoCod.txt', mode='w') as g:   #with oper -> sartu fitxategiaren izena
    lerroakAldatuta = g.writelines(lerroak)

#buscar como escribir una lista en un fichero

"""
if __name__=="__main__":
    kodifikatu()

"""