#code, number

class Groups:
    def __init__(self, code, num):
        self.kodigoa = code
        self.number = num


    def getKodigoa(self):
        return self.kodigoa

    def setKodigoa(self, kode):
        self.kodigoa = kode

    def getNumber(self):
        return self.number

    def setNumber(self, zenb):
        self.number = zenb

    def print(self):
        print("Kodea: " + str(self.kodigoa) + ", Number: " + str(self.number))
