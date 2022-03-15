
#include <stdio.h>
#include <string.h>

int main() {  
          
        int altuera;
        
        
        printf("Sartu altuera bat: ");
        scanf("%d", &altuera);
        
        
        for (int row = 1; row <= altuera; ++row) {
        	for (int col = 1, numCols = 2 * altuera -1; col <= numCols; ++col) {
        		if ((row + col >= altuera + 1) && (row >= col - altuera + 1)) {
                    printf("* ");
                } else {
                    printf("  ");
                }
			}
			printf("\n");
		}
         
}















//4.	Egin programa bat zeinek erabiltzaileari altuera bat eskatu eta berarekin ondorengo 
//piramidearen irudi geometrikoa lortuko duen. Egin bere balore taula.
