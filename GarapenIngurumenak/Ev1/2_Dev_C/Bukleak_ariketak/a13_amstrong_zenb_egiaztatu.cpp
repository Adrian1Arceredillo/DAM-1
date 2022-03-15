#include <stdio.h>
#include <string.h>
#include <cmath>

int main() {  
          
        int zenbaki;
        int contDigits = 0;
        int kalkuluaDigit;
        int resultado = 0;
        int ultDigito;
        
        printf("Sartu zenbaki bat: ");
        scanf("%d",&zenbaki);
        
        int number = zenbaki;
        
		int ult;
        while (number != 0) {
        	number = number / 10;
        	++contDigits;
        	        	
		}
		
		//int exp = contDigits;		
		number = zenbaki;
		
		while (number != 0) {
			//resto es el último dígito del número introducido
			ultDigito = number % 10;
			
			kalkuluaDigit = pow(ultDigito, contDigits);
			resultado = resultado + kalkuluaDigit;
			
        	number = number / 10;
        	
		}
		
		if (resultado == zenbaki) {
			printf("Armstrong zenbaki bat da. ");
			
		} else {
			printf("EZ da Armstrong zenbaki bat. ");
		}
		
		
		
}

/*
https://www.programiz.com/cpp-programming/examples/check-armstrong-number
https://ourcodeworld.co/articulos/leer/872/como-determinar-si-un-numero-es-un-numero-de-armstrong-en-c
http://codigogx.blogspot.com/2016/05/codigo-para-contar-cantidad-de-digitos.html
https://beastieux.com/2008/01/03/codigo-c-calcular-numero-de-digitos/
*/
/*
Múltiples ejercicios:
http://jotajotavm.com/ejercicios-resuelto-c-cplusplus-10-Calcular-cuantas-cifras-tiene-un-numero.html
*/

