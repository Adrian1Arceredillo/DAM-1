"""
17.	Idatzi zerrenda bateko elementu guztiak biderkatuko dituen programa bat.
"""

zerrenda = [2, 9, 11, 6, 3]
print("\nLista: " + str(zerrenda))

multiTodo = 1

for i in range(len(zerrenda)):
	multiTodo *= zerrenda[i]

print("Resultado multipl.: " + str(multiTodo))