#include <stdio.h>
#include <string.h>

bool funcionIsPrime(int cadaNumero) {
	for (int i = 2; i <= cadaNumero / 2; ++i) {
		if (cadaNumero % i == 0) {
			return false;
		}
	}
}

int main() {
	
	int lim1, lim2;
	bool esPrimo = true;
	
	printf("Sartu hasierako limitea: ");
	scanf("%d", &lim1);
	printf("Sartu bukaerako limitea: ");
	scanf("%d", &lim2);
	
	//int numeros = lim1;
	
	for (int x = lim1; x <= lim2; ++x) {
		if (funcionIsPrime(x)) {
			printf("%d ", x);
		}
	}
	
}
