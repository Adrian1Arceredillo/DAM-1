"""
3.	Idatzi Python programa bat ondorengo patroia erabiliko duena habiratutako for bukleak erabiliz. (for bat bestearen barruan)
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
"""

tamaina = 5

for i in range(tamaina, 0, -1):
    for j in range(i - 1, tamaina):
        print("*",end=" ")
    print()
for i in range(tamaina - 1, 0, -1):
    for j in range(0, i):
        print("*", end=" ")
    print()
