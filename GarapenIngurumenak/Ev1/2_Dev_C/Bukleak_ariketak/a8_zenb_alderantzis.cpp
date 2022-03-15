#include <stdio.h>
#include <string.h>

int main() {  
          
        int zenbaki;
        int digit;
        int reverse_zenbaki = 0;
        
        printf("Sartu zenbaki oso bat: ");
        scanf("%d",&zenbaki);
        
        while (zenbaki != 0) {
        	digit = zenbaki % 10;
        	reverse_zenbaki = reverse_zenbaki*10 + digit;
        	
        	zenbaki = zenbaki / 10;
		}
        
        
		printf("%d",reverse_zenbaki);
		
}
