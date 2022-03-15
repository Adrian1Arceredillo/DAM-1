
#include <stdio.h>
#include <string.h>

int main(){  
          
		  
		int x = 2;
		int y = 6;
		int z = 4;
		
        if (x>y || x<z) {
			printf("Verdadero");	
		} else {
			printf("Falso");
		}
		
		
		return 0;
}

//La respuesta es "verdadero". Ya que al tener un ||, basta con que se cumpla una de las dos condiciones.
