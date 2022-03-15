
#include <stdio.h>
#include <string.h>

int main() {  
          
         int zenbakia;
		 int faktoriala = 1;		
         
         printf("Sartu zenbaki bat: ");
         scanf("%d",&zenbakia);
         
         while (zenbakia > 0) {
         	
         	faktoriala = faktoriala * zenbakia;
         	--zenbakia;
		 }
        
       
		printf("Zenbakiaren faktoriala %d da.", faktoriala);

}
