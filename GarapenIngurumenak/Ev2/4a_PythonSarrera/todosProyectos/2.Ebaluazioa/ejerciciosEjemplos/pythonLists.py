
miLista1 = ['enero', 'febrero', 1, 2];

print(miLista1)
print(miLista1[1])      #acceder a un elemento concreto de la lista creada
print(len(miLista1))    #mostrar la longitud de la lista
print(type(miLista1))   #muestra de qué tipo es el parámetro que le pasamos; en este caso sería la lista "miLista1"
print(type(miLista1[1]))    #mostrar el tipo del elemento de la lista indicado; -> enero
print(type(miLista1[3]))    #mostrar el tipo del elemento de la lista indicado; -> 1
print('--------------')

#mostrar elementos de la lista
print('Primero elemento de la lista: ' + miLista1[0])
print('Longitud de la lista: ' + str(len(miLista1)))
print('Mostrar el tipo de X objeto: ' + str(type(miLista1)))
print('Mostrar el tipo de X elemento de la lista: ' + str(type(miLista1[1])))
print('--------------')

#constructor de listas
print('Crear una lista: ')
lista2 = list(("apple", "bannana", "cherry"))   #crear una lista
print(lista2)
print('--------------')

#actualizar una lista
print('Actualizar una lista: ')
print('Añadir un elemento: ')
lista3 = list((123, 'xyz', 'zara', 'abc'))  #crear nueva lista
print(lista3)
lista3.append(2014)     #añadir un nuevo elemento a la lista
print(lista3)
print('--------------')

#sobrescribir una lista
print('Sobrescribir lista: ')
print('Especificando la posicion del elemento deseado: ')
lista4 = list(('hola', 110, 'agua'))
print(lista4)
lista4[2] = 'fuego'
print(lista4)
print('--------------')

print('Sobrescribir lista: ')
print('Filtrando el valor del elemento: ')
lista5 = list(('me', 156, 'adrian'))
print(lista5)
for i, elemento in enumerate(lista5):
    if elemento == 'me':
        lista5[i] = lista5[i].capitalize()
print(lista5)
print('--------------')

#mostrar de uno en uno elementos de la lista
print('Numerar elementos de una lista:')
thislist = ['apple', 'bannana', 'cherry']
for x in thislist:
    print(x)
print('--------------')

#imprimir todos los elementos según su index number
print('Numerar elementos de una lista segun index number:')
thislist = ["apple", "banana", "cherry"]
for i in range(len(thislist)):
  print(thislist[i])
print('--------------')

#imprimir todos los elementos utilizando un bucle while que recorra todos los index number
print('Numerar elementos de una lista segun index number (usando un bucle while):')
thislist = ["apple", "banana", "cherry"]
i = 0
while i < len(thislist):
  print(thislist[i])
  i = i + 1
print('--------------')


#solamente los elementos de una lista que contengan X valor, se pasarán a otra lista
fruits = ["apple", "banana", "cherry", "kiwi", "mango"]
print("aaa")
print(fruits)
newlist = []
for x in fruits:
  if "a" in x:
    newlist.append(x)
print(newlist)
print('--------------')


#copiar una lista
print('Copiar una lista: ')
thislist = ["apple", "banana", "cherry"]
mylist = thislist.copy()    #tambien se puede hacer: mylist = list(thislist)
print(mylist)
print('--------------')


#eliminar un ELEMENTO específico de la lista
print('Eliminar "banana":')
thislist = ["apple", "banana", "cherry"]
print(thislist)
thislist.remove("banana")   #el método remove() elimina el elemento especificado
print(thislist)
print('--------------')

#eliminar un INDEX específico de la lista
print('Eliminar el elemento en la posicion 1')
thislist = ["apple", "banana", "cherry"]
print(thislist)
thislist.pop(1)     #el método pop() elimina el index especificado
print(thislist)
print('--------------')

#eliminar el último elemento de la lista
print('Eliminar el ultimo elemento de la lista: ')
thislist = ["apple", "banana", "cherry"]
print(thislist)
thislist.pop()
print(thislist)
print('--------------')

#eliminar X elemento de la lista
print('Eliminar un determinado elemento de la lista: ')
thislist = ["apple", "banana", "cherry"]
print(thislist)
del thislist[0]
print(thislist)
print('--------------')

#eliminar la lista completa
print('Eliminar la lista completa: ')
thislist = ["apple", "banana", "cherry"]
print(thislist)
del thislist
print('--------------')

#limpiar el contenido de la lista
print('Limpiar el contenido de toda la lista: ')
thislist = ["apple", "banana", "cherry"]
print(thislist)
thislist.clear()
print(thislist)
print('--------------')

#seguir con join lists en w3schools

print("REPETDIDOS")
lista1 = list[1, 2, 1, 3, 5]
print(lista1)
lista1 = list(set(lista1))
print(lista1)

#https://www.tutorialspoint.com/built-in-list-functions-and-methods-in-python