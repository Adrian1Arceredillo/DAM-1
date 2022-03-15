
#include <stdio.h>
#include <string.h>

int main() {  
          
        int altuera;
        
        printf("Sartu altuera bat: ");
        scanf("%d", &altuera);
        
        
        for (int row = 1; row <= altuera; ++row) {
        	for (int col = 1; col <= row; ++col) {
        		printf("* ");
			}
			printf("\n");
		}
         
}















//1.	Egin programa bat zeinek erabiltzaileari altuera bat eskatu 
//eta berarekin ondorengo irudi geometrikoa lortuko duen. Egin bere balore taula.
