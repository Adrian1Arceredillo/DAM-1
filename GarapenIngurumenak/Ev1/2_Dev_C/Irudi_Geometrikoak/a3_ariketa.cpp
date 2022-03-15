
#include <stdio.h>
#include <string.h>

int main() {  
          
        int altuera;
        
        printf("Sartu altuera bat: ");
        scanf("%d", &altuera);
        
        
        for (int row = 1; row <= altuera; ++row) {
        	for (int col = 1; col <= altuera; ++col) {
        		if (row == 1 || row == altuera || col == 1 || col == altuera) {
                    printf("* ");
                } else {
                    printf("? ");
                }
			}
			printf("\n");
		}
         
}















//3.	Egin programa bat zeinek erabiltzaileari karratu baten aldearen 
//luzera bat eskatu eta berarekin karratu baten perimetroa marraztuko duen.
//Azaleraren gainerakoa, veste karaketere batez beteko da. Egin bere balore taula.
