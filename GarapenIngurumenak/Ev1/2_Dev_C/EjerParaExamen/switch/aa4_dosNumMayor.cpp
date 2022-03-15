#include<stdio.h>
#include<string.h>

int mayorNumero(int n1, int n2) {
	int elMayor;
	if (n1 > n2) {
		elMayor = n1;
	} else {
		elMayor = n2;
	}
	//printf("%d", elMayor);
	return elMayor;
}

int menorNumero(int n1, int n2) {
	int elMenor;
	if (n2 > n1) {
		elMenor = n1;
	} else {
		elMenor = n2;
	}
	printf("%d", elMenor);
}

bool esImpar(int numeroMasAlto) {
	
	if(numeroMasAlto % 2 != 0) {
		return true;
	}
}

int main() {
	
	int num1, num2;
	
	printf("Lehenengo zenbakia: ");
	scanf("%d", &num1);
	printf("Bigarren zenbakia: ");
	scanf("%d", &num2);
	
	char konparazioa;
	printf("Zer konparatu nahi duzu? (</>/d) ");
	fflush(stdin);
	scanf("%c", &konparazioa);
	
	switch(konparazioa) {
		
		case '>':
			mayorNumero(num1, num2);
			break;
			
		case '<':
			menorNumero(num1, num2);
			break;
		
		case 'd':
			if(esImpar(mayorNumero(num1, num2)) == true) {		//if(esImpar(mayorNumero(num1, num2)) == true) {	
				printf("IMPAR. ");
			} else {
				printf("PAR. ");
			}
			break;
			
		default:
			printf("No se ha encontrado. ");
			break;
	}
	
	//printf("1- %d , 2- %d", num1, num2);
	
}
