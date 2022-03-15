#include <stdio.h>
#include <string.h>

int main() {  
          
        int zenbaki;
        int digit;
        int exp;
        int resultado = 1;
        
        printf("Sartu zenbaki bat: ");
        scanf("%d",&zenbaki);
        
        printf("Sartu exponentea: ");
        scanf("%d",&exp);
        
        for (; exp != 0; --exp) {
        	resultado = resultado * zenbaki;
        	//--exp;
        	
		}
        
        
		printf("%d",resultado);
		
}
