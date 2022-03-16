"""
6.	Idatzi python programa bat string bat jasoko duena eta dituen digitu eta letra kopurua kontatuko duena (isalpha() eta is digit() funtzioak)
Sarrera adibidea : Python 3.2
Esperotako irteera :
Letrak 6
Digituak 2
"""

cantLetras = 0
cantDigitos = 0
stringUser = input("Sartu hitz/esaldi bat: ")
for i in stringUser:
    if i.isalpha():
        cantLetras += 1
    elif i.isdigit():
        cantDigitos += 1
print("Cantidad de letras: " + str(cantLetras))
print("Cantidad de digitos: " + str(cantDigitos))