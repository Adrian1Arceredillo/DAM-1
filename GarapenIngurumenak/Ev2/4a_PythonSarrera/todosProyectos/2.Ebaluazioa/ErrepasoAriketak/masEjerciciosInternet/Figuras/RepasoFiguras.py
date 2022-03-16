"""
Triángulos, Pirámides, Rombo, Otras formas...
"""

def cuadradoToL():
	tamaina = 10
	for i in range(tamaina):
		for j in range(tamaina):
			if (i <= (tamaina / 2) - 1 and j >= tamaina / 2):
				print(" ", end=" ")
			else:
				print("x", end=" ")
		print()

def cuadradoNormal():
	tamaina = 5
	for i in range(tamaina):
		for j in range(tamaina):
			print("x", end=" ")
		print()

def rectanguloNormal():
	altuera = int(input("Sartu laukizuzenaren altuera: "))
	zabalera = int(input("Sartu laukizuzenaren zabalera: "))

	for i in range(altuera):
		for j in range(zabalera):
			print("*",end=" ")
		print()

def cuadradoEnCruz():
	tamaina = 7
	for i in range(tamaina):
		for j in range(tamaina):
			if (i == (tamaina - 1) / 2 or j == (tamaina - 1) / 2 or i == 0 or i == tamaina - 1 or j == 0 or j == tamaina - 1):
				print("x", end=" ")
			else:
				print(" ", end=" ")
		print()


def trianguloTA():
	tamaina = 5
	for i in range(tamaina, 0, -1):
		for j in range(0, i):
			print("*", end=" ")
		print()

def trianguloTB():
	tamaina = 5
	for i in range(tamaina, 0, -1):
		for j in range(tamaina - i):
			print(" ", end=" ")
		for k in range(0, i):
			print("x", end=" ")
		print()

def trianguloTC():
	tamaina = 5
	for i in range(tamaina):
		for j in range(tamaina - i - 1):
			print(" ", end=" ")
		for k in range(0, i + 1):
			print("*", end=" ")
		print()

def trianguloTD():
	tamaina = 5
	for i in range(tamaina):
		for j in range(0, i + 1):
			print("*", end=" ")
		print()

def piramidePA():
	tamaina = 5
	for i in range(tamaina, 0, -1):
		for j in range(tamaina - i):
			print(" ", end=" ")
		for k in range(0, i):
			print("*", end=" ")
		for l in range(1, i):
			print("*", end=" ")
		print()



if __name__=="__main__":
	#.......cuadrados/rectángulos.......
	cuadradoToL()
	#cuadradoNormal()
	#rectanguloNormal()
	#cuadradoEnCruz()
	#.......triángulos.......
	#trianguloTA()
	#trianguloTB()
	#trianguloTC()
	#trianguloTD()
	#.......pirámides.......
	#piramidePA()