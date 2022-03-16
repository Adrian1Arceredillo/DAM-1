"""
Pedir un número al usuario y dibujar una pirámide con esa medida. La
pirámide tiene que ser de la siguiente forma:
size = 5

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

Pirámide PC -> Bot to Top (abajo completo y subir hasta arriba)
"""

tamaina = 5

for i in range(tamaina, 0, -1):
    for j in range(i - 1):
        print(" ",end=" ")
    for k in range(i - 1, tamaina):
        print("*", end=" ")
    #print()

    for l in range(i, tamaina):
        print("*", end=" ")
    print()
