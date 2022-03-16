"""
19.	Idatzi zerrenda bateko zenbaki txikiena zein den esango duen programa bat.
"""

zerrenda = [4, 9, 11, 3, 6]
print("\nLista: " + str(zerrenda))
txikiena = zerrenda[0]

for i in range(len(zerrenda)):
    if (zerrenda[i] <= txikiena):
        txikiena = zerrenda[i]
print("Txikiena: " + str(txikiena))

"""
txikiena = min(zerrenda)
print("Txikiena: " + str(txikiena))
"""