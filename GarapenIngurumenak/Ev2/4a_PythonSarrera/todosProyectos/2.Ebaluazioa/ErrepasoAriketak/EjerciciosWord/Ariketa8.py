"""
8.	Idatzi Python programa bat letra bat irakurri eta bokala edo kontsonantea den esango duena:
Esperotako irteera:

Idatzi alfabetoko letra bat: k
k kontsonantea da.
"""

letraUser = input("Sartu hizki bat: ").lower()
if (letraUser == 'a' or letraUser == 'e' or letraUser == 'i' or letraUser == 'o' or letraUser == 'u'):
    print("Es una vocal. ")
else:
    print("Es una consonante. ")