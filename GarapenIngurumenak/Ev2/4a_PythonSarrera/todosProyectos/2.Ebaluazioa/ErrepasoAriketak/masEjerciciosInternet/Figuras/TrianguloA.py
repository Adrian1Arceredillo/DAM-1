"""
Pedir un número al usuario y dibujar un triángulo con esa medida. El
triángulo tiene que ser de la siguiente forma:

* * * *
* * *
* *
*
Triángulo TA -> Top to Izquierda (arriba completo y bajar hasta la izquierda)
"""

tamaina = int(input("Sartu triangeluaren neurria: "))
for i in range(tamaina, 0, -1):
    for j in range(0, i):
        print("*",end=" ")
    print()


"""
    for row in range(1, numeroFilas):
        for col in range(row, numeroFilas):
            print("* ", end=" ")
        print()
"""

#https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-python/
#https://pynative.com/print-pattern-python-examples/
#