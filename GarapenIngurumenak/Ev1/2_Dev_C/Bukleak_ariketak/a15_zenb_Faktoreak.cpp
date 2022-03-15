#include <stdio.h>
#include <string.h>


int main() {

		int zenbaki;
	
		printf("Sartu zenbaki bat: ");
    	scanf("%d",&zenbaki);
    	printf("\n");
    	
    	for (int i = 1; i <= zenbaki; ++i) {
    		if (zenbaki % i == 0) {
    			printf("%d ", i);
			}
		}

}


/*

*/

