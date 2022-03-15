#include <stdio.h>
#include <string.h>

int main() {
	
	int base;
	int exp;
	int potencia = 1;
	
	printf("Sartu basea: ");
	scanf("%d", &base);
	
	printf("Sartu exponentea: ");
	scanf("%d", &exp);
	
	for (int i = 0; i < exp; ++i) {
		potencia = potencia * base;
	}
	printf("Zenbakiaren potentzia, %d da. ", potencia);
}
