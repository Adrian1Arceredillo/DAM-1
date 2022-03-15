#include <stdio.h>
#include <string.h>

int kalkulatuFaktoriala(int numero) {
	
	int faktorialaBalioa = 1;
	for (int i = numero; i > 0; --i) {
		faktorialaBalioa = faktorialaBalioa * i;
	}
	return faktorialaBalioa;
}

int verFactores(int numero) {
	int i = 2;
	while (numero > 1) {
		if (numero % i == 0) {
			printf("%d,", i);
			numero = numero / i;
		} else {
			++i;
		}
	}
}

int sumaDigitos(int numero) {
	int ultDigit;
	int sumaTodosLosDigitos = 0;
	while(numero > 0) {
		ultDigit = numero % 10;
		sumaTodosLosDigitos = sumaTodosLosDigitos + ultDigit;
		numero = numero / 10;
	}
	return sumaTodosLosDigitos;
}

int cuentaAtras(int numero) {
	for (int i = numero; i >= 0; --i) {
		printf("%d ", i);
	}
}

int numeroAlReves(int numero) {
	int ultDigit;
	while (numero > 0) {
		ultDigit = numero % 10;
		printf("%d", ultDigit);
		numero = numero / 10;
	}
}
//otra forma de devolver el número al revés
int numBack(int numero) {
	int ultDigit;
	int reves = 0;
	while (numero != 0) {
		ultDigit = numero % 10;
		reves = reves*10 + ultDigit;
		numero = numero / 10;
	}
	return reves;
}

int main() {
	
	int zenbakia;
	char aukera;
	int a = 0;
	
	printf("Sartu zenbaki bat: ")	;
	scanf("%d", &zenbakia);
	
	do {
		
		printf("\n##Menua##");
		printf("\n");
		printf("a) Zenbakiaren faktoriala kalkulatu \n");
		printf("b) Zenbakiaren digituen batura kalkulatu \n");
		printf("c) Zenbakitik 0-ra atzera kontu bat pantailaratu \n");
		printf("d) Zenbakiaren faktoreak ikusi \n");
		printf("e) Zenbakia alderantziz jarri \n");
		printf("z) Irten");
		printf("\n");
		
		printf("Sartu aukera bat: ");
		fflush(stdin);
		scanf("%c", &aukera);
		
		switch (aukera) {
			
			case 'a':
				printf("Zenbakiaren faktoriala, %d da. \n", kalkulatuFaktoriala(zenbakia));
				break;
			case 'b':
				printf("Digitu guztien batura %d da. \n", sumaDigitos(zenbakia));
				break;
			case 'c':
				cuentaAtras(zenbakia);
				break;
			case 'd':
				verFactores(zenbakia);
				break;
			case 'e':
				numeroAlReves(zenbakia);
				break;
			case 'z':
				break;
			default:
				printf("Eskaturiko aukera ez da aurkitu. \n");
				break;
		}
		
		
		
	} while (aukera != 'z');
	
}




