"""
12.	Idatzi Python programa bat 1 eta 9 arteko zenbaki bat asmatzeko.
 Oharra : Erabiltzaileari asmatze saiakera bat sartzeko esango zaio. Asmatzen ez badu beste
 berriz saiatzeko eskatuko zaio, asmatu arte. Asmatzen duenean “Asmatu duzu!” mezua agertuko da.
"""

import random

#print(random.randint(0, 9))

numeroSecreto = random.randint(1, 9)
print(numeroSecreto)

zenbakiaUser = int(input("Sartu 1-9 ren artean dagoen zenbaki bat: "))

while zenbakiaUser != numeroSecreto:
    zenbakiaUser = int(input("Txarto! Saiatu berriro: "))

print("\nNumero oculto: " + str(numeroSecreto))
print("Numero del Usuario: " + str(zenbakiaUser))
