"""
7.	Idatzi python programa bat ‘A’ letraren alfabetuko patroia pantailaratuko duena.
(for bukleak erabiliko dituzu eta lerro/zutabe bakoitzeko posizioak konprobatu)
  ***
 *   *
 *   *
 *****
 *   *
 *   *
 *   *
"""

zabalera = 5
altuera = 7
for y in range(altuera):
    for x in range(zabalera):
        if (y == 1 or y == 2 or y == 4 or y == 5 or y == 6) and (x == 0 or x == 4):
            print("*",end=" ")
        elif (y == 3):
            print("*",end=" ")
        elif (y == 0) and (x == 1 or x== 2 or x == 3):
            print("*", end=" ")
        else:
            print(" ", end=" ")
    print()