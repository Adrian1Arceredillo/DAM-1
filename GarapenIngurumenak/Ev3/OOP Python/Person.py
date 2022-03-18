
#clase padre

class Persona:
    def __init__(self, i, n, s, m, adina):
        self.Id = i
        self.name = n
        self.surname = s
        self.movile = m
        self.age = adina

    def getID(self):
        return self.Id

    def getName(self):
        return self.name

    def getSurname(self):
        return self.surname

    def getMovile(self):
        return self.movile

    def getAge(self):
        return self.age

    def setid(self):
        self.id = input("Enter the value of the id: ")

    def setname(self):
        self.name = input("Enter the value of the name: ")

    def setsurname(self, h):
        self.surname = h

    def setmovile(self):
        self.name = input("Enter the value of the movile number: ")

    def setAge(self):
        self.age = input("Enter the new age for him/her: ")

    def print(self):
        print(self.Id, self.name, self.surname, self.movile, self.age)







