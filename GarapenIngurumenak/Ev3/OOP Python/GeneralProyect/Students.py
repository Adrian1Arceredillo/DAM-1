import Basics

from Groups import Groups

class Students(Groups):
    #@staticmethod
    def __init__(self, nan, name, surname, tel, grKod, grNum):
        super().__init__(grKod, grNum)
        self.dni = nan
        self.izena = name
        self.abizena = surname
        self.mobile = tel

    def getDni(self):
        return self.dni

    def setDni(self):
        self.dni = input("Enter the value of the student's DNI: ")

    def getIzena(self):
        return self.izena

    def setIzena(self):
        self.izena = Basics.BasicsMethods.askstring("name")

    def getAbizena(self):
        return self.abizena

    def setAbizena(self):
        self.abizena = input("Enter the value of the student's ABIZENA: ")

    def getMobile(self):
        return self.mobile

    def setMobile(self):
        self.mobile = int(input("Enter the value of the student's MOBILE: "))

    def print(self):
        print(self.dni, self.izena, self.abizena,
              self.mobile, super().getKodigoa(), super().getNumber())

    #lists of object in python
    #def printS(self):


