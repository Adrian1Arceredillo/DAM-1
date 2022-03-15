
#include <stdio.h>
#include <string.h>

int main() {  
          
        int num1, num2, num3;
        int handiena;
        
        printf("Lehenengo zenbakia: ");
        scanf("%d", &num1);
        printf("Bigarren zenbakia: ");
        scanf("%d", &num2);
        printf("Hirugarren zenbakia: ");
        scanf("%d", &num3);
        
        /*if (num1 > num2) {
        	if (num1 > num3) {
        		handiena = num1;
			} else if (num3 > num1) {
				handiena = num3;
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				handiena = num2;
			} else if (num3 > num2) {
				handiena = num3;
			}
		} else if (num3 > num1) {
			if (num3 > num2) {
				handiena = num3;
			} else if (num2 > num3) {
				handiena = num2;
			}
		}*/
		
		if (num1 > num2 && num1 && num3) {
			handiena = num1;
		} else if (num2 > num1 && num2 > num3) {
			handiena = num2;
		} else if (num3 > num2 && num3 > num1) {
			handiena = num3;
		}
	
		printf("Hau da zenbakirik handiena: %d", handiena);
}

/*
3.	Erabiltzaileak sartutako hiru zenbakien artean zenbakirik handiena aurkitzeko programa idatzi.
*/
