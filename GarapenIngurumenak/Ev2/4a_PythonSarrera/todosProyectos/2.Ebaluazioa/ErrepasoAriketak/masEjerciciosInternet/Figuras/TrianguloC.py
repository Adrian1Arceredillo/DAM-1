"""
Pedir un número al usuario y dibujar un triángulo con esa medida. El
triángulo tiene que ser de la siguiente forma:
      *
    * *
  * * *
* * * *
Triángulo TC -> Bot to Derecha (abajo completo y subir hasta la derecha)
"""

tamaina = int(input("Sartu triangeluaren neurria: "))

for i in range(tamaina, 0, -1):
    for j in range(i - 1):
        print(" ",end=" ")
    for k in range(i - 1, tamaina):
        print("*",end=" ")
    print()
