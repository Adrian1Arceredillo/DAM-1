"""
1.	Egin ezazu programa bat 5 eta 7 zenbakien multiploak bilatuko dituena 1500 eta 2700 artean dauden zenbakietan (biak barne).
"""

lim1 = 1500
lim2 = 2700
listaNumeros = []
for i in range(lim1, lim2):
    if (i % 5 == 0 and i % 7 == 0):
        listaNumeros.append(i)
print("Lista con los numeros: " + str(listaNumeros))

