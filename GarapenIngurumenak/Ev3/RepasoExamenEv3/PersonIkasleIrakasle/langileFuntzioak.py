import os
import pickle
from Langilea import Langilea
# from Pertsona import Pertsona
import BasicMethods


def saveLangilea(obj, filename):
    with open(filename, 'ab') as outp:
        pickle.dump(obj, outp, pickle.HIGHEST_PROTOCOL)


def readLangile():
    if os.path.exists("langileInfo.pkl"):
        inp = ("langileInfo.pkl", 'rb')
        objectLangile = []
        cont = 1
        while cont == 1:
            try:
                objectLangile.append(pickle.load(inp))
            except EOFError:
                print()
                cont = 0
        for lan in objectLangile:
            Langilea.print(lan)
    else:
        print("No files found! ")


def deleteLangile():
    if os.path.exists("langileInfo.pkl"):
        inp = ("langileInfo.pkl", 'rb')
        objectLangile = []
        cont = 1
        while cont == 1:
            try:
                objectLangile.append(pickle.load(inp))
            except EOFError:
                print()
                cont = 0
        for lan in objectLangile:
            Langilea.print(lan)

        langileDelete = BasicMethods.BasicMethods.askString("ezabatu nahi duzun langilearen IZENA:")
        inp.close()
        os.remove("langileInfo.pkl")

        for lan in objectLangile:
            if Langilea.getIzena(lan).lower() != langileDelete.lower():
                saveLangilea(lan, "langileInfo.pkl")
    else:
        print("No files found")


def updateLangile():
    if os.path.exists("langileInfo.pkl"):
        inp = ("langileInfo.pkl", 'rb')
        objectLangile = []
        cont = 1
        while cont == 1:
            try:
                objectLangile.append(pickle.load(inp))
            except EOFError:
                print()
                cont = 0
        for lan in objectLangile:
            Langilea.print(lan)

        langileUpdate = BasicMethods.BasicMethods.askString("aldatu nahi duzun langilearen IZENA:")
        inp.close()
        os.remove("langileInfo.pkl")

        for lan in objectLangile:
            if Langilea.getIzena(lan).lower() != langileUpdate.lower():
                saveLangilea(lan, "langileInfo.pkl")
            else:
                oldPostua = Langilea.getPostua(lan)
                Langilea.setPostua(lan)
                newPostua = Langilea.getPostua()
                saveLangilea(lan, "langileInfo.pkl")

                print("Hasierako postua: " + str(oldPostua))
                print("Bukaerako postua: " + str(newPostua))
        print()
    else:
        print("No files found! ")


























