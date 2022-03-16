"""
Pedir una medida al usuario, y construir un CUADRADO, cuyos lados y altura
tengas el valor que ha introducido el usuario.
"""

tamaina = int(input("Sartu laukiaren tamaina: "))

for i in range(tamaina):
    for j in range(tamaina):
        print("*",end=" ")
    print()