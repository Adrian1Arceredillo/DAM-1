#include <stdio.h>
#include <string.h>

int main() {  
          
        int zenbaki;
        int cont_digits = 0;
        
        printf("Sartu zenbaki oso bat: ");
        scanf("%d",&zenbaki);
        
        while (zenbaki > 0) {
        	
        	zenbaki = zenbaki / 10;
        	++cont_digits;
        	
        	
		}
        
        
		printf("%d", cont_digits);
}
