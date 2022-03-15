#include <stdio.h>
#include <string.h>



int main() {
	
	int zenbakia;
	bool esPrimo = true;
	
	printf("Sartu zenbaki bat: ");
	scanf("%d", &zenbakia);
	
	for (int i = 2; i <= zenbakia / 2; ++i) {
		if (zenbakia % i == 0) {
			esPrimo = false;
		}
	}
	
	if (esPrimo) {
		printf("Es primo. ");
	} else {
		printf("NO es primo. ");
	}
	
}
