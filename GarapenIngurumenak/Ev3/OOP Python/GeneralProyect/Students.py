

class Student:

    """
    def __init__(self, si, sn, ss, sm, g):
        self.Id= si
        self.name = sn
        self.surname = ss
        self.movile = sm
        #self.group = g
    """

    def __init__(self, si, sn, ss, sm, adina, g, sch):
        super().__init__(si, sn, ss, sm, adina)
        self.cargo = g
        self.school = sch

    def setCargo(self):
        self.cargo = input("Enter the range of that person: ")

    def getCargo(self):
        return self.cargo

    def setSchool(self, colegio):
        self.school = colegio

    def getSchool(self):
        return self.school

    def print(self):
        print(self.Id, self.name, self.surname, self.movile, self.age, self.cargo, self.school)

