#include <stdio.h>
#include <string.h>

int main() {
	
	int zenbakia;
	int digituBakoitzarenKalkulua = 0;
	int potenciaCadaNum;
	int resultado = 0;
	
	printf("Sartu zenbaki bat: ");
	scanf("%d", &zenbakia);
	
	//contar digitos del numero
	int number = zenbakia;
	int contDigitos = 0;
	
	while (number > 0) {
		number = number / 10;
		++contDigitos;
	}
	
	number = zenbakia;
	int ultDigit;
	
	while (number > 0) {
		ultDigit = number % 10;
		potenciaCadaNum = ultDigit;
		for (int i = 0; i < contDigitos - 1; ++i) {
			potenciaCadaNum = potenciaCadaNum * ultDigit;
		}
		resultado = resultado + potenciaCadaNum;
		number = number / 10;
		
	}
	if (resultado == zenbakia) {
		printf("Armstrong zenbaki bat da. ");
	} else {
		printf("EZ da Armstrong zenbaki bat. ");
	}
}
