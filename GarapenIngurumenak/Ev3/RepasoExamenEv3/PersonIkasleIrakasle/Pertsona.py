import BasicMethods


class Pertsona:

    def __init__(self):
        self.nan = BasicMethods.BasicMethods.askInteger("pertsona honi dagokion NAN: ")
        self.izena = BasicMethods.BasicMethods.askString("pertsona honen IZENA: ")
        self.helbidea = BasicMethods.BasicMethods.askString("pertsona honen HELBIDEA: ")

    def getNan(self):
        return self.nan

    def getIzena(self):
        return self.izena

    def getHelbidea(self):
        return self.helbidea

    def setNan(self):
        self.nan = BasicMethods.BasicMethods.askInteger("pertsona honi dagokion NAN berria: ")

    def setIzena(self):
        self.izena = BasicMethods.BasicMethods.askString("pertsona honi dagokion IZEN berria: ")

    def setHelbidea(self):
        self.helbidea = BasicMethods.BasicMethods.askString("pertsona honi dagokion HELBIDE berria: ")

    def print(self):
        print("NAN: " + str(self.nan) + "Izena: " + str(self.izena) + "Helbidea: " + str(self.helbidea))




