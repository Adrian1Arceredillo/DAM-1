"""
10.	Idatzi Python programa bat zenbaki bat irakurri (1etik 10era) eta bere biderketa taula pantailaratuko duena.
Espero den irteera:
Sartu zenbakia: 6
6 x 1 = 6
6 x 2 = 12
6 x 3 = 18
6 x 4 = 24
6 x 5 = 30
6 x 6 = 36
6 x 7 = 42
6 x 8 = 48
6 x 9 = 54
6 x 10 = 60
"""

numero = int(input("Sartu 1-10 tarteko zenbaki bat: "))
for i in range(1, 11):
    print(str(numero) + " x " + str(i) + " = " + str(numero * i))
