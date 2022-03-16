"""
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
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

for i in range(tamaina - 1, 0, -1):
    for j in range(tamaina - i):
        print(" ",end=" ")
    for k in range(0, i):
        print("*",end=" ")

    for l in range(1, i):
        print("*",end=" ")
    print()
