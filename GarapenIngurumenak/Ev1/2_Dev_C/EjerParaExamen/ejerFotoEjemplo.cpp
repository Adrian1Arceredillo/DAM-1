

#include <stdio.h>
#include <string.h>

int faktorialaKalkulatu(int number) {
	
	int valorFaktorial = 1;
	
	for (int i = number; i > 0; --i) {
		valorFaktorial = valorFaktorial * i;
		
	}
	return valorFaktorial;
	
}

int digituenBaturaKalkulatu(int number) {
	
	int sumaDigitos = 0;
	int ultDigito;
	while (number != 0) {
		ultDigito = number % 10;
		sumaDigitos = sumaDigitos + ultDigito;
		
		number = number / 10;
	}
	return sumaDigitos;
}

int atzerakoKontaketaIkusi(int number) {
	
	for (int i = number; i >= 0; --i) {
		printf("%d ", i);
	}
	printf("\n");
	
}

int main() {
	
		char aukera;
		int zenbakia;
		
		printf("\nSartu zenbaki bat: ");
		scanf("%d", &zenbakia);
		
		do {
			printf("\nMenua:\n");
			printf("\n");
			printf("a) Zenbakiaren faktoriala kalkulatu \n");
			printf("b) Zenbakiaren digituen batura kalkulatu \n");
			printf("c) Zenbakitik 0-ra atzera kontu bat pantailaratu \n");
			printf("d) Irten \n");
			
			
			
			fflush(stdin);
			printf("Aukeratu bat: ");
			scanf("%c", &aukera);
			
			switch (aukera) {
			
			case 'a':
				
				printf("El valor del factorial es %d \n", faktorialaKalkulatu(zenbakia));
				printf("---------------------------------\n");
				break;
			case 'b':
				
				printf("La suma de los dígitos del numero es %d \n", digituenBaturaKalkulatu(zenbakia));
				printf("---------------------------------\n");
				break;
			case 'c':
				
				atzerakoKontaketaIkusi(zenbakia);
				printf("---------------------------------\n");
				break;
			case 'd':
				break;
			default:
				printf("\t\tEskaturiko aukera ez da aurkitu!! \n");
				break;
			}
			
		} while(aukera != 'd');
		
		
	
		
		
        
		
}







/*el programa hará lo siguiente:
	* leer un número
	* mostrar el siguiente menú:
		a) Calcular el factorial del número
		b) Calcular la suma de los dígitos del número
		c) Mostrará una cuenta atrás desde el número hasta el cero
*/

