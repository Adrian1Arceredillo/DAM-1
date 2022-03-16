"""
13.	Idatzi Python programa bat hitz bat eskatu eta buelta emango diona.
"""

stringUser = input("\nSartu hitz bat: ")

for i in reversed(stringUser):
    print(i,end="")

"""
for i in range(len(stringUser)):
    print(str(stringUser[len(stringUser) -i - 1]), end="")
"""
"""
for i in range(len(stringUser) -1, -1, -1):
    print(stringUser[i],end="")
"""
