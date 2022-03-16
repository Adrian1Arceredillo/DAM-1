"""
14.	Idatzi Python programa bat 100 eta 400 zenbakien artean (biak barne) digitu guztiak bakoitiak
dituen zenbakiak idatziko dituena. Lortutako zenbakiak koma batez banatuta pantailaratu itzazu.
"""

lim1 = 111
lim2 = 399

fullImpar = True
numDigitosImpares = []

for i in range(lim1, lim2+1):
    for x in str(i):
        if (int(x) % 2 == 0):
            fullImpar = False
            break;
        else:
            fullImpar = True
    if (fullImpar == True):
        #numDigitosImpares.append(i)
        print(str(i))

#print("Lista números full Impares: " + str(numDigitosImpares))