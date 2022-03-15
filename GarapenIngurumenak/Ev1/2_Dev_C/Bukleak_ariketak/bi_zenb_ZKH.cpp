
#include <stdio.h>
#include <string.h>

int main() {  
          
         int num1;
         int num2;
         int zkh;
//         int temporala;
         
         printf("Sartu zenbaki bat: ");
         scanf("%d",&num1);
         
         printf("Sartu beste zenbaki bat: ");
         scanf("%d",&num2);
         
         if (num1 > num2) {
         	temporala = num2;
		 } else {
		 	temporala = num1;
		 }
		 
		 while (num1 % temporala != 0 && num2 % temporala != 0) {
		 	
		 	--temporala;
		 	
		 }
		 
		
}

/*
while (num1 % temporala != 0 && num2 % temporala != 0) {
		 	
		 	--temporala;
		 	
		 }
*/
