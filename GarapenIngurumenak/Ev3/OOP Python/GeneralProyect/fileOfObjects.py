import pickle

from Students import Students
from Groups import Groups


def save_object(obj, filename):
    with open('guardarObjetos.txt', 'w') as infoGuardar:  # Overwrites any existing file.
        pickle.dump(obj, infoGuardar, pickle.HIGHEST_PROTOCOL)

    ans = 1
    while ans == 1:
        s1 = Students.Student()
        save_object(s1, 'student_data.txt')
        ans = int(input("Do you want to add a new student? (1/0)"))
        del s1
