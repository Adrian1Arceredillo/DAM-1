
#include <stdio.h>
#include <string.h>

int main() {  
          
         int lerroak = 10;
         int zutabeak = 10;
         int taula;		//size
         int row = 1;
		 int col = 1;
		 
		 printf("Zenbat taula nahi dituzu? ");
		 scanf("%d",&taula);
		 
		 printf(" * |");
		 for (col = 1; col <= taula; ++col) {
		 	
		 	printf("%4d",col);
		 }
		 
         printf("\n");
         //printf("----");
		 for (col = 1; col <= taula; ++col) {
		 	
		 	printf("%4s", "----");
		 }
        
         printf("\n");
                  
		 for (row = 1; row <= taula; ++row) {
		 	printf("%2d |", row);
		 	for (col = 1; col <= taula; ++col) {
		 		printf("%4d", row*col);
			 }
			 printf("\n");
		 }
       
		return 0;

}
