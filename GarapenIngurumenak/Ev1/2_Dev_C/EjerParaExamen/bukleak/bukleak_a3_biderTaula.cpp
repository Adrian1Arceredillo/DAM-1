#include <stdio.h>
#include <string.h>


int main() {

		int size;
		int row = 1;
		int col = 1;
		
		printf("Sartu nahi duzun taularen balioa: ");
		scanf("%d", &size);
		
		printf("%d \n", size);
		
		printf(" * |");
		for (col = 1; col <= size; ++col) {
		 	
			printf("%4d",col);
		}
		 
        printf("\n");
        printf("----");
		for (col = 1; col <= size; ++col) {
		 	
		 	printf("%4s", "----");
		}
        
        printf("\n");
         
		for (row = 1; row <= size; ++row) {
		 	printf("%2d |", row);
		 	for (col = 1; col <= size; ++col) {
		 		printf("%4d", row*col);
			 }
			 printf("\n");
		}
       
		return 0;
		
}


/*

*/

