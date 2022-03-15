#include <stdio.h>
#include <string.h>


int main() {
	
	int zenbakia;
	int ultDigit;
	
	printf("Sartu zenbaki bat: ");
	scanf("%d", &zenbakia);
	
	
	while (zenbakia != 0) {
		ultDigit = zenbakia % 10;
		printf("%d", ultDigit);
		zenbakia = zenbakia / 10;
	}
	
}


/*
7.-C programa zenbaki oso baten zenbaki kopurua zenbatzeko
*/

