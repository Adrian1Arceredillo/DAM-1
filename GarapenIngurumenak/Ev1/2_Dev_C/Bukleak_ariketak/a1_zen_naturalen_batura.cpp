
#include <stdio.h>
#include <string.h>

int main() {  
          
         int num1 = 1;
         int ult_natural = 9;
         int suma = 0;
         
         while (num1 > 0 && num1 <= ult_natural) {
         	
         	suma = suma + num1;
         	++num1;
		 }
        
       
		printf("La suma es: %d", suma);

}
