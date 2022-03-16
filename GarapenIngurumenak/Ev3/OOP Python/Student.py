#clase hija
#import self as self

from Person import Persona

class Student(Persona):

    """
    def __init__(self, si, sn, ss, sm, g):
        self.Id= si
        self.name = sn
        self.surname = ss
        self.movile = sm
        #self.group = g
    """

    def __init__(self, si, sn, ss, sm, g):
        super().__init__(si, sn, ss, sm)
        self.cargo = g

    def __setCargo(self):
        self.cargo = input("Enter the range of that person")

    def print(self):
        print(self.Id, self.name, self.surname, self.movile, self.cargo)

