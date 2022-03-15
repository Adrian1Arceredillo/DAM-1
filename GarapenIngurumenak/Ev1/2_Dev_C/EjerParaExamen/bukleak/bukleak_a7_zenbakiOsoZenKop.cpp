#include <stdio.h>
#include <string.h>


int main() {
	
	int zenbakia;
	int contDigitos = 0;
	
	printf("Sartu osoa den zenbaki bat: ");
	scanf("%d", &zenbakia);

	while (zenbakia <= 0) {
		printf("Ez da zenbakia oso bat. Saiatu berriro: ");
		scanf("%d", &zenbakia);
	}
	
	while (zenbakia != 0) {
		++contDigitos;
		zenbakia = zenbakia / 10;
	}
	
	printf("%d", contDigitos);
}


/*
7.-C programa zenbaki oso baten zenbaki kopurua zenbatzeko
*/

