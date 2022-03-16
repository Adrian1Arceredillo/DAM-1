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

Pirámide PD -> Izquierda to Derecha (izquierda completo y bajar hacia la derecha)
"""

tamaina = 5

for i in range(tamaina, 0, -1):
    for j in range(i - 1, tamaina):
        print("*",end=" ")
    print()

for i in range(tamaina- 1, 0, -1):
    for j in range(0, i):
        print("*", end=" ")
    print()