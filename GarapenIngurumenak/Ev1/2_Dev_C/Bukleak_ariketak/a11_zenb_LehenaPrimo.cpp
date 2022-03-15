#include <stdio.h>
#include <string.h>

int main() {  
          
        int zenbaki;
        int resto;
        bool isPrime = true;
        
        
        printf("Sartu zenbaki bat: ");
        scanf("%d",&zenbaki);
        
        
        
        int number = zenbaki;
        
        /*if (number == 0 || number == 1 || number == 4) {
        	printf("No es primo.");
		}*/
		
		for (int x = 2; x <= (number / 2); ++x) {
			if (number % x == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime == true) {
			printf("Es primo.");
		} else {
			printf("No es primo.");
		}
}

/*
https://parzibyte.me/blog/2019/07/12/numero-primo-c/
https://parzibyte.me/blog/2019/09/26/cpp-numero-primo/
https://www.it-swarm-es.com/es/c%2B%2B/determinar-si-un-numero-es-primo/970123830/
*/

/*
for (int i = 1; i < number; ++i) {
        	if (number % i != 0) {
        		printf("%d zenbakia LEHENA da. ", zenbaki);
			} else {
				printf("%d zenbakia EZ da LEHENA. ", zenbaki);
			}
		}
*/

