"""
Recibir un String, y que el programa imprima hasta donde nosotros
le indiquemos.
"""
import random

hitzaUser = input("Sartu hitz bat: ")
limitePrint = random.randint(1, len(hitzaUser))
print(limitePrint)
print(hitzaUser[limitePrint - 1])

trozoPrint = ""

for i in range(len(hitzaUser)):
    if i == (limitePrint - 1):
        trozoPrint += hitzaUser[i]
        break
    else:
        trozoPrint += hitzaUser[i]
print("Parte del string: " + str(trozoPrint))

"""
for i in range(0, limitePrint):
    trozoPrint += hitzaUser[i]
print("Parte del string: " + str(trozoPrint))
"""

"""
trozoString = ""

for i in hitzaUser:
    if i.isdigit():     #el programa se detendrá cuando se encuentre un número en el String
        break;
    else:
        trozoString += i

print("Parte del string: " + str(trozoString))
"""
