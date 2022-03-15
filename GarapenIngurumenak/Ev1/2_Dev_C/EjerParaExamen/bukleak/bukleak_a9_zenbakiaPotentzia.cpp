

#include <stdio.h>
#include <string.h>

int zenbakiarenPotentziaKalkulatu(int base, int exp) {
	int valorPotencia = 1;
	for (int i = 0; i < exp; ++i) {
		valorPotencia = valorPotencia * base;
	}
	return valorPotencia;
}


int main() {
	
	int zenbakia;
	int exponentea;
	
	printf("Sartu zenbakia (basea): ");
	scanf("%d", &zenbakia);
	
	printf("Sartu berretzailea (exponentea): ");
	scanf("%d", &exponentea);
	
	printf("%d",zenbakiarenPotentziaKalkulatu(zenbakia, exponentea));
		
}







/*el programa hará lo siguiente:
	* leer un número
	* mostrar el siguiente menú:
		a) Calcular el factorial del número
		b) Calcular la suma de los dígitos del número
		c) Mostrará una cuenta atrás desde el número hasta el cero
*/

