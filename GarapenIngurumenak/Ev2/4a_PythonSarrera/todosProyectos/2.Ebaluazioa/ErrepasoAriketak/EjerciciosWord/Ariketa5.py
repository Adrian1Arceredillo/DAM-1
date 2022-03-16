"""
5.	Idatzi Python programa bat 1etik 50era iteratuko duena, zenbakiak pantailaratuz. Iterazioetan zenbakia hiruren
multiploa bada “fizz” idatziko du zenbakiaren ordez, eta bosten multiploa bada “buzz”. Bien multiploak badira idatzi "fizzbuzz".
Irteera adibidea :
fizzbuzz
1
2
fizz
4
buzz
"""

for i in range(1, 51):
    if (i % 3 == 0 and i % 5 == 0):
        print("fizzbuzz")
    elif (i % 3 == 0):
        print("fizz")
    elif (i % 5 == 0):
        print("buzz")
    else:
        print(i)