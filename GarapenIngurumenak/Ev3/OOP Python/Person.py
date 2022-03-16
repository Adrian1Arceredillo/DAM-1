
#clase padre

class Persona:
    def __init__(self, i,n, s,M):
       self.Id= i
       self.name = n
       self.surname = s
       self.movile = M

    def setid(self):
        self.id = input("Enter the value of the id")

    def setname(self):
        self.name = input("Enter the value of the name")

    def setsurname(self, h):
        self.surname = h

    def setmovile(self):
        self.name = input("Enter the value of the movile number")

    def print(self):
        print(self.Id, self.name, self.surname, self.movile)







