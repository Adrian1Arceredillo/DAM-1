
#include <stdio.h>
#include <string.h>

int main() {  
          
         int num1;
         int num2;
         int zkh = 0;
         
         int txikiena;
		 
         
         printf("Sartu zenbaki bat: ");
         scanf("%d",&num1);
         
         printf("Sartu beste zenbaki bat: ");
         scanf("%d",&num2);
         
         if (num1 > num2) {
         	
         	txikiena = num2;
			
		 } else {
		 	
		 	txikiena = num1;
		 }
		 
		 printf("Txikiena %d da. \n", txikiena);
		 
		 
		while (zkh == 0)  {
		
		 if (num1 % txikiena == 0 && num2 % txikiena == 0) {
		 	zkh = txikiena;
		 } else {
		 	--txikiena;
		 }
		} 
		printf("Bi zenbakien ZKH %d da. ", zkh);
}

/*
mkt = el número mayor multiplicado por el número menor, y el resultado lo dividimos entre el zkh.
*/
