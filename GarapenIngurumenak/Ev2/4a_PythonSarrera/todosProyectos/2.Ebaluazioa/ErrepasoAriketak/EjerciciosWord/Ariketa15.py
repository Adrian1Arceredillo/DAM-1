"""
15.	Hiru zenbakiren batezbestekoa kalkulatuko duen programa bat idatzi.
"""

contNumeros = 0

num1 = int(input("\nSartu LEHENENGO zenbakia: "))
contNumeros += 1
num2 = int(input("Sartu BIGARREN zenbakia: "))
contNumeros += 1
num3 = int(input("Sartu HIRUGARREN zenbakia: "))
contNumeros += 1

media = (num1 + num2 + num3) / contNumeros

print("\nMedia: " + str(media))