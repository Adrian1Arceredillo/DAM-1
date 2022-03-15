
#include <stdio.h>
#include <string.h>

int main(){  
          
		  
		int x = 2;
		int y = 6;
		
		if ((x<y && x!=y) || !(x==y)) {
			printf("Verdadero");
		} else {
			printf("Falso");
		}
		
		
		return 0;
}

/*La respuesta es "Verdadero" porque se cumple cualquiera de las condiciones que hay a cada lado del 
operador ||. En este caso, en uno de los lados hay u operador &&; lo que significa que se tiene que 
cumplir todo lo que haya dentro del &&.
*/
