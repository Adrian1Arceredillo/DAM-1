import Basics

class Persona:
    def __init__(self, nan, name, surname, tel):
        self.dni = nan
        self.izena = name
        self.abizena = surname
        self.mobile = tel

    def getDni(self):
        return self.dni

    def getIzena(self):
        return self.izena

    def getAbizena(self):
        return self.abizena

    def getMobile(self):
        return self.mobile

    def setDni(self):
        self.dni = Basics.BasicsMethods.askstring("DNI")

    def setIzena(self, nombre):
        self.izena = nombre

    def setAbizena(self):
        self.abizena = input("Enter the value of the surname: ")

    def setMobile(self):
        self.mobile = int(input("Enter the value of the mobile phone: "))

    def print(self):
        print(self.dni, self.izena, self.abizena, self.mobile)
