

class BasicsMethods():
    @staticmethod
    def askinteger(name):
        a= input("Enter a value (int) for" + name)
        return a

    @staticmethod
    def askstring(name):
        a=input("Enter a value for " + name + ": ")
        return a
