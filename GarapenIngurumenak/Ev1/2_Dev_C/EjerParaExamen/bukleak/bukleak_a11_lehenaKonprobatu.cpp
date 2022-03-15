#include <stdio.h>
#include <string.h>
bool lehenaDenKonprobatu(int numero) {
	
	for (int i = 2; i <= (numero / 2); ++i) {
		if (numero % i == 0) {
			return true;
		} 
	}
	return false;
}
	


int main() {
	
	int zenbakia;
	bool isPrime = true;
	
	printf("Sartu zenbaki bat: ");
    scanf("%d",&zenbakia);
    
    for (int i = 2; i <= (zenbakia / 2); ++i) {
    	if (lehenaDenKonprobatu(zenbakia)) {
    		isPrime = false;
		} 
	}
	
	if (isPrime == true){
		printf("Sarturiko %d zenbakia, LEHENA da. ", zenbakia);
	} else {
		printf("%d zenbakia, EZ da lehena. ", zenbakia);
	}
		
}


/*
7.-C programa zenbaki oso baten zenbaki kopurua zenbatzeko
*/

