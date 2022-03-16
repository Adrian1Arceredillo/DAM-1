"""
2.	Idatzi programa bat tenperaturak Celsius eta Fahrenheit artean itzuliko dituena, bi zentzuetan.
 [ Formula : c/5 = f-32/9 [ non c = tenperatura celsiusetan eta  f = tenperatura fahrenheitetan ]
Irteera posiblea :
60°C is 140 in Fahrenheit
45°F is 7 in Celsius
"""

print("1- C to F ")
print("2- F to C:")

aukera = int(input("Zer egin nahi duzu) (1 edo 2) "))

if aukera == 1:
    celsiusEntrada = int(input("Sartu C ren balio bat: "))
    f = (9/5 * celsiusEntrada) + 32
    print(f)
elif aukera == 2:
    fahrenheitEntrada = int(input("Sartu F ren balio bat: "))
    c = (fahrenheitEntrada - 32) * (5 / 9)
    print(c)