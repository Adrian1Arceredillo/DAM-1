"""
Pedir un número al usuario y dibujar una pirámide con esa medida. La
pirámide tiene que ser de la siguiente forma:
size = 5
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
Pirámide PA -> Top to bot (arriba completo y bajar hacia el centro)
"""

tamaina = int(input("Sartu triangeluaren neurria: "))

for i in range(tamaina, 0, -1):
    for j in range(tamaina - i):
        print(" ",end=" ")
    for k in range(0, i):
        print("*",end=" ")

    for l in range(1, i):
        print("*",end=" ")
    print()