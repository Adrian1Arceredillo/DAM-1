"""
Pedir dos valores al usuario (base y altura). El rectángulo se
construirá con estas medidas.
"""

base = int(input("Sartu laukizuzenaren oinarria: "))
altura = int(input("Sartu laukizuzenaren altuera: "))

for i in range(altura):
    for j in range(base):
        print("*", end=" ")
    print()