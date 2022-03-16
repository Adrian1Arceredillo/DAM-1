"""
Pedir un número al usuario y dibujar un triángulo con esa medida. El
triángulo tiene que ser de la siguiente forma:
* * * *
  * * *
    * *
      *
Triángulo TB -> Top to Derecha (arriba completo y bajar hasta la derecha)
"""

tamaina = int(input("Sartu triangeluaren neurria: "))

for i in range(tamaina, 0, -1):
    for j in range(tamaina - i):
        print(" ", end=" ")
    for k in range(0, i):
        print("*",end=" ")
    print()
