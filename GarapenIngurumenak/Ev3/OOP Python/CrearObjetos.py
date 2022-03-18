from Person import Persona
from Student import Student

print()
p2 = Persona(2, "hola", "amigo", 456789321, 16)
p2.setname()    #este método pide un parámetro (String) al usuario
p2.setsurname("gomez")  #recibe un String
p2.print()
print("--------------------------------")

s1 = Student(3, "prueba", "student", 213564978, 21, "estudiante", "Uni-Eibar")
colegio = input("Enter the new school of this student: ")
s1.setSchool(colegio)

s1.print()