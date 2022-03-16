"""
Tabla de multiplicar. En este caso, si uno de los resultados de la tabla
en cuestión, termina con un 0, aparecerá un mensaje en lugar del resultado.
"""

a = int(input("Sartu zenbakizko balio bat: "))

for i in range(1, 11):
    if str(a * i).endswith("0"):
        print(str(a) + " * " + str(i) + " = " + "Este resultado termina con un 0. ")
    else:
        print(str(a) + " * " + str(i) + " = " + str(a * i))
print()