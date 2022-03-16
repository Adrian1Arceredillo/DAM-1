"""
18.	Idatzi zerrenda bateko zenbaki handiena zein den esango duen programa bat.
"""

zerrenda = [4, 9, 11, 3, 6]
print("\nLista: " + str(zerrenda))
handiena = zerrenda[0]

for i in range(len(zerrenda)):
    if (zerrenda[i] > handiena):
        handiena = zerrenda[i]
print("Handiena: " + str(handiena))

"""
handiena = max(zerrenda)
print("Handiena: " + str(handiena))
"""