
#include <stdio.h>
#include <string.h>

int main() {  
          
        int zenbakia;
        
        printf("Sartu zenbaki bat: ");
        scanf("%d", &zenbakia);
        
        if (zenbakia > 0) {
        	printf("Sarturiko (%d) zenbakia, POSITIBOA da. ", zenbakia);
		} else if (zenbakia < 0) {
			printf("Sarturiko (%d) zenbakia, NEGATIBOA da. ", zenbakia);
		} else if (zenbakia == 0) {
			printf("Sarturiko (%d) zenbakia, CERO da. ", zenbakia);
		}
}

/*
5.	Idatzi C programa bat zeinek sartutako zenbakia positiboa, negatiboa edo zero den egiaztatzeko.
*/
