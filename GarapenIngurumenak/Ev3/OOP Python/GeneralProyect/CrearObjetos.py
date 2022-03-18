
from Groups import Groups
from Students import Students
import fileOfObjects

#group
print()
print("--------------------------------")
print("GROUPS: ")
g2 = Groups("Dep. Uni", 2)
g2.print()

g2.setKodigoa("DAM1")
g2.setNumber(4)
g2.print()

#student
print("--------------------------------")
print("STUDENTS:")

s1 = Students(16597, "Anne", "Saez", 123546879, "ASIR2", 9)
s2 = Students(35226, "Pedro", "Lopez", 978465321, "DAM1", 6)
s2.setIzena()
print()
student_list = [s1, s2]

for i in student_list:
    i.print()

fileOfObjects.save_object(student_list, "guardarObjetos.txt")

#save in a file (guardarObjetos.txt)

#departamentos
print("--------------------------------")
print("DEPARTMENTS:")


#profesores



