#include <stdio.h>
#include <string.h>

int main () {
	
	int zenbakia;
	
	printf("Sartu zenbaki bat: ");
	scanf("%d", &zenbakia);
	
	int i = 2;
	while (zenbakia > 1) {
		if (zenbakia % i == 0) {
			printf("%d ", i);
			zenbakia = zenbakia / i;
		} else {
			++i;
		}
	}
	
}
