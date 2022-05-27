from Pertsona import Pertsona
import BasicMethods


class Langilea(Pertsona):

    def __init__(self):
        Pertsona.__init__(self)

        self.postua = BasicMethods.BasicMethods.askString("langile honen POSTUA: ")
        self.soldata = BasicMethods.BasicMethods.askInteger("langile honen SOLDATA: ")

    def getPostua(self):
        return self.postua

    def getSoldata(self):
        return self.soldata

    def setPostua(self):
        self.postua = BasicMethods.BasicMethods.askString("langile honen POSTU berria: ")

    def setSoldata(self):
        self.soldata = BasicMethods.BasicMethods.askInteger("langile honen SOLDATA berria: ")

    def print(self):
        print("NAN: " + str(self.nan) + ", Izena: " + str(self.izena) + ", Helbidea: " + str(self.helbidea) +
              ", Postua: " + str(self.postua) + ", Soldata: " + str(self.soldata))


