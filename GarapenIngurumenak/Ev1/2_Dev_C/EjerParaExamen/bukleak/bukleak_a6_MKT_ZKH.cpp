

#include <stdio.h>
#include <string.h>


int main() {
	
		int num1, num2;
		int zkh;
		int mkt;
		int txikiena;
		int handiena;
		
		printf("Sartu lehenengo zenbakia: ");
		scanf("%d", &num1);
		
		printf("Sartu bigarren zenbakia: ");
		scanf("%d", &num2);
		
		if (num1 > num2) {
			txikiena = num2;
			handiena = num1;
		} else if (num2 > num1) {
			txikiena = num1;
			handiena = num2;
		} else if (num1 == num2) {
			printf("Bi zenbakiak berdinak dira. Irtetzen...");
		}
		
		printf("\n");
		printf("Txikiena %d da. \n", txikiena);
		
		while (zkh == 0) {
			if (num1 % txikiena == 0 && num2 % txikiena == 0) {
				zkh = txikiena;
			} else {
				--txikiena;
			}
			
		}
		
		mkt = (num1 * num2) / zkh;
		
		printf("\n");
		printf("Bi zenbakien MKT-a %d da. \n", mkt);
		printf("Bi zenbakien ZKH-a %d da. \n", zkh);
		
	
		
		
        
		
}







/*el programa hará lo siguiente:
	* leer un número
	* mostrar el siguiente menú:
		a) Calcular el factorial del número
		b) Calcular la suma de los dígitos del número
		c) Mostrará una cuenta atrás desde el número hasta el cero
*/

