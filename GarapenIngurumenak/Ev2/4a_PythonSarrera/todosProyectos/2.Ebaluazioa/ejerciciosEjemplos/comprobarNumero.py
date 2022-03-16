
import random

print('Genera un número aleatorio entre 0-10:')
numAleatorio = (random.randrange(0, 10))
print(numAleatorio)

num = input('Introduce un número: ')
print(num)


if (int(numAleatorio) == int(num)):
    print('Se han generado los mismos números. ')
else:
    print('Los números aleatorios no coinciden. ')