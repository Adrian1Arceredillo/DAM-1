# include <stdio.h>


int txikiena(int z1, int z2) {
	int txiki;
	
	if(z1 < z2) {
		txiki = z1;
	} else {
		txiki = z2;
	}
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
	
	printf("Zatitzailea: %d", txikiena(z1,z2));
}


