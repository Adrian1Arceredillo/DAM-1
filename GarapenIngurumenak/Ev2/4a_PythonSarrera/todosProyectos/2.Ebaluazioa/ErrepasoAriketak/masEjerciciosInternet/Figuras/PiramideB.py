"""
Pedir un número al usuario y dibujar una pirámide con esa medida. La
pirámide tiene que ser de la siguiente forma:
size = 5
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *
Pirámide PB -> Derecha to Izquierda (derecha completo y bajar hacia la izquierda)
"""

tamaina = 5

for i in range(tamaina, 0, -1):
    for j in range(i - 1):
        print(" ",end=" ")
    for k in range(i - 1, tamaina):
        print("*",end=" ")
    print()
for i in range(tamaina - 1, 0, -1):
    for j in range(tamaina - i):
        print(" ", end=" ")
    for k in range(0, i):
        print("*",end=" ")
    print()