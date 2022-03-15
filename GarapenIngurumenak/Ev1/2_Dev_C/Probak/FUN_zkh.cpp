# include <stdio.h>




int txikiena(int z1, int z2) {
	int txiki;
	
	if(z1 < z2) {
		txiki = z1;
	} else {
		txiki = z2;
	}
}

int zkh(int z1, int z2) {
	int zatitzailea = txikiena(z1, z2);	//saber cual de los dos números es el menor
	
	for (int i = zatitzailea; i >= 1; --i) {	//ir probando divisores desde el número menor hasta llegar al primero.
	
		if ((z1 % i == 0) && (z2 % i == 0)) { 	//el número que estamos probando es divisor de ambos? el resto es cero?
			return i;
		}
		
	}
	return 1;
}

int main()
{
	int z1, z2, zatitzailea;
	printf("Sartu bi zenbaki oso: ");
	scanf("%d %d", &z1, &z2);
	
	if (z1 < z2) {
		zatitzailea = z1;
	} else {
		zatitzailea = z2;
	}
	
	printf("Zatitzailea: %d", zkh(z1,z2));
}

